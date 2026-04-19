package sv7.setec.hotelrental.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import sv7.setec.hotelrental.Model.User.User;
import sv7.setec.hotelrental.Repository.User.UserRepository;

@Service
public class CustomOAuth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) {
        OAuth2User oAuth2User = super.loadUser(userRequest);
        String email = oAuth2User.getAttribute("email");
        String name = oAuth2User.getAttribute("name");

        // Only save if the email doesn't exist yet
        userRepository.findByEmail(email).ifPresentOrElse(
                existingUser -> {
                    // User exists, maybe update their name if it changed
                    existingUser.setName(name);
                    userRepository.save(existingUser);
                },
                () -> {
                    // User is new, save them
                    User newUser = new User();
                    newUser.setEmail(email);
                    newUser.setName(name);
                    newUser.setPassword("OAUTH_USER");
                    newUser.setPhone("N/A");
                    userRepository.save(newUser);
                }
        );

        return oAuth2User;
    }
}