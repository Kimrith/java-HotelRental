package sv7.setec.hotelrental.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("settingController")
@RequestMapping("/admin")
public class SettingController {
    @GetMapping("/setting")
    public String setting(Model model) {
        model.addAttribute("title", "Setting Panel");
        model.addAttribute("content", "admin/Components/setting");
        model.addAttribute("active", "setting");

        return "admin/index";
    }
}
