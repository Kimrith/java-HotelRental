package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class Payment {

    @GetMapping("/payment")
    public String payment(Model model){
        model.addAttribute("content", "user/Components/payment");
        model.addAttribute("active", "payment");
        model.addAttribute("title", "Payment");
        return "user/index";
    }
}
