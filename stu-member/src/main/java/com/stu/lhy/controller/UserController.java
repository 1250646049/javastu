package com.stu.lhy.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {



    @GetMapping("/test")
    public String testRequest(){
        log.info("success");
        return "success";
    }


}
