package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerReviewController")
@RequestMapping("/owner")
public class ReviewController {

    @GetMapping("/review")
    public String review(Model model) {
        model.addAttribute("content", "owner/Components/review");
        model.addAttribute("active", "review");
        return "owner/index";
    }
}
