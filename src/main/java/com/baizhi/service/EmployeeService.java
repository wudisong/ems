package com.baizhi.service;

import com.baizhi.entity.Employee;

import java.util.List;

public interface EmployeeService {
    void regist(Employee employee);

    List<Employee> getAll();

    void removeByPrimaryKey(Integer id);

    Employee getById(Integer id);

    void update(Employee employee);
}
