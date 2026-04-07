package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerHomeController")
@RequestMapping("/owner")
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("content", "owner/Components/homepage");
        model.addAttribute("active", "home");
        return "owner/index";
    }
}
