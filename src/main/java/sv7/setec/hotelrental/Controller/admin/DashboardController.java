package sv7.setec.hotelrental.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("adminDashboardController")
@RequestMapping("/admin")

public class DashboardController {
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("title", "admin Panel");
        model.addAttribute("content", "admin/Components/dashboard");
        model.addAttribute("active", "dashboard");

        return "admin/index";
    }
}
