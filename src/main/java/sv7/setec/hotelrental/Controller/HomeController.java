package sv7.setec.hotelrental.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("dashboard")
public class HomeController {

    @RequestMapping("/home")
    public String HomePage(Model model) {
        model.addAttribute("content", "Components/homepage.html");
        return "index";
    }

    @GetMapping("/search")
    public String Search(Model model){
        model.addAttribute("content", "Components/seach.html");
        return "index";
    }

    @GetMapping("/mybooking")
    public String MyBooking(Model model){
        model.addAttribute("content", "Components/booking.html");
        return "index";
    }

    @GetMapping("/favorite")
    public String Favorite(Model model){
        model.addAttribute("content", "Components/favorite.html");
        return "index";
    }

    @GetMapping("/message")
    public String Message(Model model){
        model.addAttribute("content", "Components/message.html");
        return "index";
    }

    @GetMapping("/payment")
    public String Payment(Model model){
        model.addAttribute("content", "Components/payment.html");
        return "index";
    }

    @GetMapping("/profile")
    public String Profile(Model model){
        model.addAttribute("content", "Components/profile.html");
        return "index";
    }
}

