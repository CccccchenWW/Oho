package com.cww.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // @Controller 和 @ResponseBody 集合到一起
public class QuickController {

    @RequestMapping("/quick1")
    public String quick() {
        return "SpringBoot";
    }
}
