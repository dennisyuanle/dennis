package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class FirstController {

    @RequestMapping("/first")
    public String firstMethod(@RequestParam("name") String username, @RequestParam("pwd") String password) {
        log.info("firstMethod");
        log.debug("请求参数：\n username:{},\n pwd:{}", username, password);
        return "result : " + username + "///" + password ;
    }

    @RequestMapping("/second")
    public String secondMethod(@RequestParam("name") String username, @RequestParam("pwd") String password) {
        log.info("secondMethod");
        log.debug("请求参数：\n username:{},\n pwd:{}", username, password);
        return "result : " + username + "///" + password ;
    }
}
