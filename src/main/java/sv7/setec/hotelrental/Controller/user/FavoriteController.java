package sv7.setec.hotelrental.Controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class FavoriteController {

    @GetMapping("/favorite")
    public String favorite(Model model){
        model.addAttribute("content", "user/Components/favorite");
        model.addAttribute("active", "favorite");
        model.addAttribute("title", "Favorite");
        return "user/index";
    }

}
