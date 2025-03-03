package com.duydk.cruddemo.dao;

import com.duydk.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
