package sv7.setec.hotelrental.Controller.user;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice // IMPORTANT: Don't forget this!
public class GlobalController {

    @ModelAttribute("username")
    public String getUsername() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null && auth.isAuthenticated() && !auth.getName().equals("anonymousUser")) {
            // Check if the user is a Google User
            if (auth.getPrincipal() instanceof OAuth2User oAuth2User) {
                return oAuth2User.getAttribute("name");
            }
            // Otherwise return the standard username/email
            return auth.getName();
        }
        return "Guest";
    }
}