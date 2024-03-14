package com.jbj338033.javaswaggertemplate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    @GetMapping("/example")
    public String getExample() {
        return "Example Template";
    }
}
