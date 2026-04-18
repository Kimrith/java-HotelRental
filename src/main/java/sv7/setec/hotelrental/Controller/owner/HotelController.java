package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerHotelController")
@RequestMapping("/owner")
public class HotelController {

    @GetMapping("/hotel")
    public String hotel(Model model) {
        model.addAttribute("content", "owner/Components/hotel");
        model.addAttribute("active", "hotel");
        return "owner/index";
    }
}
