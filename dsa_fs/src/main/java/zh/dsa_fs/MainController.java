package zh.dsa_fs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index() {
        return "redirect:/enter-numbers";
    }
    

    @RequestMapping("/enter-numbers")
    public String EnterNumbers(Model model) {
        model.addAttribute("e", "egg");

        return "enter-numbers";
    }
}
