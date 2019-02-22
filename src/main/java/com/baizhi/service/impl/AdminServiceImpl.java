package com.baizhi.service.impl;

import com.baizhi.dao.AdminMapper;
import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Boolean login(String username, String password) {
        Admin admin = adminMapper.selectByUsernameAndPassword(username, password);
        if (admin != null) {
            return true;
        } else {
            return false;
        }
    }
}
