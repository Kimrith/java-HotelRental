package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class MessageController {

    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("content", "user/Components/message");
        model.addAttribute("active", "message");
        model.addAttribute("title", "Message");
        return "user/index";
    }

    @GetMapping("/message/detail/id")
    public String detail(Model model){
        model.addAttribute("content", "user/Components/message-detail-id");
        model.addAttribute("title", "message-detail-id");
        return "user/index";
    }
}
