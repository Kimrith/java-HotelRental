package sv7.setec.hotelrental.Controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder; // 1. Add this import
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sv7.setec.hotelrental.Model.User.User;
import sv7.setec.hotelrental.Repository.User.UserRepository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("user")
public class Auth {

    @Autowired
    private UserRepository userRepository;

    @Autowired // 2. MUST add this or it will crash!
    private PasswordEncoder passwordEncoder;

    @GetMapping("/register")
    public String register() {
        return "user/auth/register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user, RedirectAttributes ra) {
        // 1. Encrypt and Save
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        // 2. Pass the name to the next page manually
        ra.addFlashAttribute("registeredName", user.getName());

        return "redirect:/dashboard/home";
    }

    @GetMapping("/login")
    public String login() {
        return "user/auth/login";
    }
}