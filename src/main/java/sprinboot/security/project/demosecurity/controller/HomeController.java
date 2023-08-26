package sprinboot.security.project.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String homePage() {
        return "home";
    }
    //add a request mapping for /leaders
    @GetMapping("/leaders")
    public String showLeaders() {
        return "leaders";
    }
    //add a request mapping for /systems
    @GetMapping("/systems")
    public String showSystems() {
        return "systems";
    }
}
