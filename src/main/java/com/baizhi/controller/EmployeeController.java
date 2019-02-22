package com.baizhi.controller;

import com.baizhi.entity.Employee;
import com.baizhi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/regist")
    public Object regist(Employee employee) {
        employeeService.regist(employee);
        return "redirect:/login.jsp";
    }

    @RequestMapping("/getAll")
    public Object getAll(HttpServletRequest request) {
        request.setAttribute("list", employeeService.getAll());
        return "forward:/emplist.jsp";
    }

    @RequestMapping("/add")
    public Object add(Employee employee) {
        employeeService.regist(employee);
        return "redirect:/employee/getAll";
    }

    @RequestMapping("/removeById")
    public Object removeById(Integer id) {
        employeeService.removeByPrimaryKey(id);
        return "redirect:/employee/getAll";
    }

    @RequestMapping("/updateShow")
    public Object updateShow(Integer id, HttpServletRequest request) {
        Employee byId = employeeService.getById(id);
        request.setAttribute("employee", byId);
        return "forward:/updateEmp.jsp";
    }

    @RequestMapping("/update")
    public Object update(Employee employee) {
        employeeService.update(employee);
        return "redirect:/employee/getAll";
    }
}
