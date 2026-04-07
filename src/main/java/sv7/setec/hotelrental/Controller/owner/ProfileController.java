package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerProfileController")
@RequestMapping("/owner")
public class ProfileController {

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("content", "owner/Components/profile");
        model.addAttribute("active", "profile");
        return "owner/index";
    }
}
