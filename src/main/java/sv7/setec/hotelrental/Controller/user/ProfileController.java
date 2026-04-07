package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class ProfileController {

    @GetMapping("/profile")
    public String profile(Model model){
        model.addAttribute("content", "user/Components/profile");
        model.addAttribute("active", "profile");
        model.addAttribute("title", "Profile");
        return "user/index";
    }
}
