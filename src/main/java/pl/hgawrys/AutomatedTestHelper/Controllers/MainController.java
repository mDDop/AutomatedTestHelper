package pl.hgawrys.AutomatedTestHelper.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    public void run() {
    }

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }
}
