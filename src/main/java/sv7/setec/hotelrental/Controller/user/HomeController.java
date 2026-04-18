package sv7.setec.hotelrental.Controller.user;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userHomeController")
@RequestMapping("/dashboard")
public class HomeController {

    @GetMapping("/home")
    public String homePage(Model model,
                           java.security.Principal principal,
                           @AuthenticationPrincipal OAuth2User oauth2User) {

        String displayUsername = "Guest";

        // 1. Check if we just registered (Manual Input)
        if (model.containsAttribute("registeredName")) {
            displayUsername = (String) model.getAttribute("registeredName");
        }
        // 2. Check if logged in via Google
        else if (oauth2User != null) {
            displayUsername = oauth2User.getAttribute("name");
        }
        // 3. Check if logged in via Manual Login page
        else if (principal != null) {
            displayUsername = principal.getName();
        }

        model.addAttribute("content", "user/Components/homepage");
        model.addAttribute("active", "dashboard");
        model.addAttribute("title", "Home");
        model.addAttribute("username", displayUsername);

        return "user/index";
    }
}