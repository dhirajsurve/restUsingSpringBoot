package com.dhiraj.api.restUsingSpringBoot.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/health")
    public  String welcome()
    {
        return "Up and Running !";
    }
}
