package com.baizhi.ems;

import com.baizhi.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTest {
    @Autowired
    private AdminService adminService;

    @Test
    public void test1() {
        Boolean login = adminService.login("gaosong", "123456");
        System.out.println(login);
    }
}
