package com.baizhi.ems;

import com.baizhi.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void test1() {
        System.out.println(employeeService.getAll());
    }
}
