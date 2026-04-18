package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class SearchController {

    @GetMapping("/search")
    public String search(Model model){
        model.addAttribute("content", "user/Components/seach");
        model.addAttribute("active", "search");
        model.addAttribute("title", "Search");
        return "user/index";
    }
}
