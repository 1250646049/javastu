package com.stu.lhy.controller;


import com.stu.lhy.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {



    @GetMapping("/test")
    public User testRequest(User user) {
        log.info("success");
        return user;
    }


}
