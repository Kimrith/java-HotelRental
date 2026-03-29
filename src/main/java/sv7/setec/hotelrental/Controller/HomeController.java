package sv7.setec.hotelrental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class HomeController {

    @RequestMapping()
    public String HomePage(Model model) {

        model.addAttribute("content", "Components/homepage.html");

        return "index";
    }
}
