package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerBookingController")
@RequestMapping("/owner")
public class BookingController {

    @GetMapping("/booking")
    public String booking(Model model) {
        model.addAttribute("content", "owner/Components/booking");
        model.addAttribute("active", "booking");
        return "owner/index";
    }
}
