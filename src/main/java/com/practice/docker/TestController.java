package com.practice.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/api/test")
    public String test(){
        return "<h1 style=\"color:red\">It's Working<h1>";
    }
}