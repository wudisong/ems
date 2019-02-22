package com.baizhi.controller;

import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public Object login(String username, String password) {
        Boolean login = adminService.login(username, password);
        if (login) {
            return "redirect:/employee/getAll";
        } else {
            return "redirect:/login.jsp";
        }
    }
}
