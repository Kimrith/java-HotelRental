package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class MybookingController {

    @GetMapping("/mybooking")
    public String myBooking(Model model){
        model.addAttribute("content", "user/Components/booking");
        model.addAttribute("active", "mybooking");
        model.addAttribute("title", "My Booking");
        return "user/index";
    }
}
