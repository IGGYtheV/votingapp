package com.voteforlunch.votingapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {

    //    @GetMapping( "/hello")
//    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
//        return String.format("Hello %s!", name);
//    }
    @GetMapping("/hello")
    public String sayHello() {
        return "index";
    }
}
