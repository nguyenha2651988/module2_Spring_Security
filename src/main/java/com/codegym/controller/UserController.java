package com.codegym.controller;

import java.security.Principal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/user")
    public String user() {
        // Nhận tên người dùng được xác thực từ Hiệu trưởng
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        //Nhận tên người dùng được xác thực từ SecurityContext
        SecurityContext context = SecurityContextHolder.getContext();
        return "admin";
    }
}