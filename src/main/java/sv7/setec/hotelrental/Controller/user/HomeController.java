package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("userHomeController")
@RequestMapping("/dashboard")
public class HomeController {

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("content", "user/Components/homepage");
        model.addAttribute("active", "dashboard");
        return "user/index";
    }

    @GetMapping("/search")
    public String search(Model model){
        model.addAttribute("content", "user/Components/seach");
        model.addAttribute("active", "search");
        return "user/index";
    }

    @GetMapping("/mybooking")
    public String myBooking(Model model){
        model.addAttribute("content", "user/Components/booking");
        model.addAttribute("active", "mybooking");
        return "user/index";
    }

    @GetMapping("/favorite")
    public String favorite(Model model){
        model.addAttribute("content", "user/Components/favorite");
        model.addAttribute("active", "favorite");
        return "user/index";
    }

    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("content", "user/Components/message");
        model.addAttribute("active", "message");
        return "user/index";
    }

    @GetMapping("/payment")
    public String payment(Model model){
        model.addAttribute("content", "user/Components/payment");
        model.addAttribute("active", "payment");
        return "user/index";
    }

    @GetMapping("/profile")
    public String profile(Model model){
        model.addAttribute("content", "user/Components/profile");
        model.addAttribute("active", "profile");
        return "user/index";
    }
}