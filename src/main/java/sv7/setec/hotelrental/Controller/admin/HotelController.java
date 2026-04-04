package sv7.setec.hotelrental.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("hotelController")
@RequestMapping("/admin")
public class HotelController {
    @GetMapping("/hotel")
    public String hotel(Model model) {
        model.addAttribute("active", "hotel");
        model.addAttribute("title", "Hotel Management");
        model.addAttribute("content", "admin/Components/hotel");
        return "admin/index";
    }


}
