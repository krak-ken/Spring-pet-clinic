package course.project.pet_clinic_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    
    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
}