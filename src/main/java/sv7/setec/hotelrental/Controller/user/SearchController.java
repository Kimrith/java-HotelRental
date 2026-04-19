package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Controller
@RequestMapping("/dashboard")
public class SearchController {

    @GetMapping("/search")
    public String search(Model model) {
        model.addAttribute("content", "user/Components/seach");
        model.addAttribute("active", "search");
        model.addAttribute("title", "Search Hotels");

        // REMOVED: model.addAttribute("username", "Guest");
        // The GlobalController will now automatically provide the real name here.

        return "user/index";
    }
}
