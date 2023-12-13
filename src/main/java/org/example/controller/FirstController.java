package org.example.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.commons.lang3.StringUtils;
import org.example.entity.FunctionEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.example.service.TestService;

import java.util.List;

@RestController
@RequestMapping("/test")
@Slf4j
public class FirstController {

    @Autowired
    TestService testService;

    @RequestMapping("/first")
    public String firstMethod(@RequestParam("name") String username, @RequestParam("pwd") String password) {
        log.info("firstMethod");
        log.info("请求参数：\n username:{},\n pwd:{}", username, password);
        return "result : " + username + "///" + password ;
    }

    @RequestMapping("/second")
    public String secondMethod(@RequestParam("name") String username, @RequestParam("pwd") String password) {
        log.info("secondMethod");
        log.info("请求参数：\n username:{},\n pwd:{}", username, password);
        return "result : " + username + "///" + password ;
    }

    @RequestMapping("/testDevelop")
    public String testDevelop(@RequestParam("name") String username, @RequestParam("pwd") String password) {
        log.info("testDevelop");
        log.info("请求参数：\n username:{},\n pwd:{}", username, password);
        return "develop : " + username + "///" + password ;
    }

    @RequestMapping("/testJdbc")
    public List<FunctionEntity> testJdbc(@RequestParam("name") String name) {
        log.info("testJdbc");
        log.info("请求参数：name:{}", name);
        LambdaQueryWrapper<FunctionEntity> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(StringUtils.isNotEmpty(name), FunctionEntity::getName, name);
        List<FunctionEntity> list = testService.getList(wrapper);
        return list;
    }

    @RequestMapping("/testWrapper")
    public List<FunctionEntity> testWrapper(@RequestParam("id") Long id, @RequestParam("name") String name) {
        log.info("testWrapper");
        log.info("请求参数：id:{}, name:{}", id, name);
        LambdaQueryWrapper<FunctionEntity> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(id != null, FunctionEntity::getId, id);
        wrapper.ne(id != null, FunctionEntity::getId, id);
        wrapper.like(StringUtils.isNotEmpty(name), FunctionEntity::getName, name);
        List<FunctionEntity> list = testService.getList(wrapper);
        return list;
    }

    @RequestMapping("/visitor")
    public List<FunctionEntity> getVisitor() {
        log.info("getVisitor");
        LambdaQueryWrapper<FunctionEntity> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(id != null, FunctionEntity::getId, id);
        wrapper.ne(FunctionEntity::getId, 2);
        wrapper.ne(FunctionEntity::getId, 8);
        List<FunctionEntity> list = testService.getList(wrapper);
        return list;
    }
}
