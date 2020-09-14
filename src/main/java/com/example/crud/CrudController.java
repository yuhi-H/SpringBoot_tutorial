package com.example.crud;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class CrudController {
    @RestController
    public static class HelloController {

        @RequestMapping("/")
        String hello() {
            return "Hello World";
        }
    }
}
