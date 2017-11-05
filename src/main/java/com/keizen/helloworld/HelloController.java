package com.keizen.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Wow Sangeet .. You deployed your first service in PCF !";
    }

}