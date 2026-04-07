package sv7.setec.hotelrental.Controller.owner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("ownerRoomController")
@RequestMapping("/owner")
public class RoomController {

    @GetMapping("/room")
    public String room(Model model) {
        model.addAttribute("content", "owner/Components/room");
        model.addAttribute("active", "room");
        return "owner/index";
    }
}
