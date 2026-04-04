package sv7.setec.hotelrental.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("analyticController")
@RequestMapping("/admin")
public class AnalyticController {
    @GetMapping("/analytic")
    public String analytic(Model model) {
        model.addAttribute("title", "Analytic");
        model.addAttribute("content", "admin/Components/analytic");
        model.addAttribute("active", "analytic");

        return "admin/index";
    }
}
