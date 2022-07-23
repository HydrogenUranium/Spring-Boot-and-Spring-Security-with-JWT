package com.haikal.SpringSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.haikal.SpringSecurity.Domain.User;
import com.haikal.SpringSecurity.Service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers() {
        log.info("User controller get all users ");
        log.info("User controller get all users ");
        return ResponseEntity.ok().body(userService.getListUser());

    }

}
