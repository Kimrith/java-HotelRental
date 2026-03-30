package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userHomeController")
@RequestMapping("dashboard")
public class HomeController {

    @RequestMapping("/home")
    public String HomePage(Model model) {
        model.addAttribute("content", "user/Components/homepage.html");
        return "user/index";
    }

    @GetMapping("/search")
    public String Search(Model model){
        model.addAttribute("content", "user/Components/seach.html");
        return "user/index";
    }

    @GetMapping("/mybooking")
    public String MyBooking(Model model){
        model.addAttribute("content", "user/Components/booking.html");
        return "user/index";
    }

    @GetMapping("/favorite")
    public String Favorite(Model model){
        model.addAttribute("content", "user/Components/favorite.html");
        return "user/index";
    }

    @GetMapping("/message")
    public String Message(Model model){
        model.addAttribute("content", "user/Components/message.html");
        return "user/index";
    }

    @GetMapping("/payment")
    public String Payment(Model model){
        model.addAttribute("content", "user/Components/payment.html");
        return "user/index";
    }

    @GetMapping("/profile")
    public String Profile(Model model){
        model.addAttribute("content", "user/Components/profile.html");
        return "user/index";
    }
}

