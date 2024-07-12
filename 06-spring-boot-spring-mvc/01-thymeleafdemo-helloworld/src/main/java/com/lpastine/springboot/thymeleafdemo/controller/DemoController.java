package com.lpastine.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // create a mapping for "/hello"
    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());

        // As we have Thymeleaf dependency on Maven POM
        // Spring Boot will autoconfigure to use Thymeleaf
        // src/main/resources/templates/helloworld.html
        return "helloworld";
    }
}
