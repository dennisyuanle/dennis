package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
@Slf4j
public class SecondController {

    @RequestMapping("/test")
    public String firstMethod(@RequestParam("name") String username, @RequestParam("pwd") String password) {
        log.info("test SecondController log");
        return "username is  : " + username + ", pwd is : " + password ;
    }
}
