package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerMessageController")
@RequestMapping("/owner")
public class MessageController {

    @GetMapping("/message")
    public String message(Model model) {
        model.addAttribute("content", "owner/Components/message");
        model.addAttribute("active", "message");
        return "owner/index";
    }
}
