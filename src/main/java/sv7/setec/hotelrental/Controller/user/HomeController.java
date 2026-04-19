package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userHomeController")
@RequestMapping("/dashboard")
public class HomeController {

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("content", "user/Components/homepage");
        model.addAttribute("active", "dashboard");
        model.addAttribute("title", "Home");
        return "user/index";
    }
}