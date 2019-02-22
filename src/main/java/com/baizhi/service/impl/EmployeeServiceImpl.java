package com.baizhi.service.impl;

import com.baizhi.dao.EmployeeMapper;
import com.baizhi.entity.Employee;
import com.baizhi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void regist(Employee employee) {
        employeeMapper.insert(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public void removeByPrimaryKey(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Employee getById(Integer id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Employee employee) {
        employeeMapper.updateByPrimaryKeySelective(employee);
    }
}
