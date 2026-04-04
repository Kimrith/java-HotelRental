package sv7.setec.hotelrental.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("approvalController")
@RequestMapping("/admin")
public class ApprovalController {
    @GetMapping("/approval")
    public String approval(Model model) {
        model.addAttribute("title", "Approval Request");
        model.addAttribute("content", "admin/Components/approval");
        model.addAttribute("active", "approval");

        return "admin/index";
    }
}
