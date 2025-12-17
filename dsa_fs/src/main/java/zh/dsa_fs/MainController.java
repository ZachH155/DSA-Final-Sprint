package zh.dsa_fs;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@Controller
public class MainController {
    
    @RequestMapping("/")
    public String index() {
        return "redirect:/enter-numbers";
    }
    

    //enter numbers page
    @RequestMapping("/enter-numbers")
    public String renderEnterNumbers() {
        return "enter-numbers";
    }

    @PostMapping("/enter-numbers")
    public String postEnterNumbers(@RequestParam("numbers") String numbers) { 
        String[] numbersArray = null;
        numbersArray = numbers.split(",");
        return "redirect:/enter-numbers";
    }

    @PostMapping("/past-trees")
    public String redirectPreviousTrees() {
        return "redirect:/previous-trees";
    }


    //previous trees page
    @RequestMapping("/previous-trees")
    public String renderPreviousTrees() {
        return "previous-trees";
    }
    
    
    
}
    

