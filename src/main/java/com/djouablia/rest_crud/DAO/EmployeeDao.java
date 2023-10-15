package com.djouablia.rest_crud.DAO;

import com.djouablia.rest_crud.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
    List<Employee> findByLastName(String lastName);
}
