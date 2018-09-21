package pl.hgawrys.AutomatedTestHelper.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.hgawrys.AutomatedTestHelper.VariableCreator;

@Controller
public class MainController {

    public void run() {
    }

    @Autowired
    VariableCreator vCreator;

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

    @PostMapping("/")
    public String index(Model model,
                        @RequestParam("dataInput") String dataInput){

        String dataOutput = "kk";
        System.out.println(dataInput);

        model.addAttribute("dataOutput", vCreator.getVariables(dataInput));

        return "index";
    }

}
