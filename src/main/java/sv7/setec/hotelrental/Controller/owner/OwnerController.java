package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerHomeController")
@RequestMapping("/owner")
public class OwnerController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("content", "owner/Components/homepage");
        model.addAttribute("active", "home");
        return "owner/index";
    }

    @GetMapping("/hotel")
    public String hotel(Model model) {
        model.addAttribute("content", "owner/Components/hotel");
        model.addAttribute("active", "hotel");
        return "owner/index";
    }

    @GetMapping("/booking")
    public String booking(Model model) {
        model.addAttribute("content", "owner/Components/booking");
        model.addAttribute("active", "booking");
        return "owner/index";
    }

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("content", "owner/Components/message");
        model.addAttribute("active", "message");
        return "owner/index";
    }

    @GetMapping("/payment")
    public String payment(Model model) {
        model.addAttribute("content", "owner/Components/payment");
        model.addAttribute("active", "payment");
        return "owner/index";
    }

    @GetMapping("/profile")
    public String profile(Model model) {
        model.addAttribute("content", "owner/Components/profile");
        model.addAttribute("active", "profile");
        return "owner/index";
    }
}