package sv7.setec.hotelrental.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userController")
@RequestMapping("/admin")
public class UserController {
    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("active", "user");
        model.addAttribute("title", "User Management");
        model.addAttribute("content", "admin/Components/user");
        return "admin/index";
    }
}
