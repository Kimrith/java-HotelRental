package sv7.setec.hotelrental.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 1. Inject your custom service
    @Autowired
    private CustomOAuth2UserService customOAuth2UserService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Throwable {
        http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers(
                            "/user/register",
                            "/dashboard/home",
                            "/dashboard/search",
                            "/css/**", "/js/**", "/images/**"
                    ).permitAll();
                    auth.anyRequest().authenticated();
                })
                .oauth2Login(oauth2 -> {
                    oauth2.loginPage("/user/register");
//                    oauth2.loginPage("/dashboard/home");
                    // 2. THIS IS THE MISSING PART: Link the service here
                    oauth2.userInfoEndpoint(userInfo ->
                            userInfo.userService(customOAuth2UserService)
                    );
                    oauth2.defaultSuccessUrl("/dashboard/home", true);
                })
                .logout(logout -> {
                    logout.logoutSuccessUrl("/user/register");
                    logout.permitAll();
                });

        return http.build();
    }
}