package com.example.GhibiliAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ghibli")
public class StudioGhibliController {
    @GetMapping("/test")
        public String test() {
        return "The test worked";
    }

}
