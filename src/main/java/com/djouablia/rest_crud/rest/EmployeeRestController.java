package com.djouablia.rest_crud.rest;

import com.djouablia.rest_crud.DAO.EmployeeDao;
import com.djouablia.rest_crud.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDao employeeDao;

    public EmployeeRestController(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @GetMapping("/findall")
    public List<Employee> retrievalldata(){

      return employeeDao.findAll();


    }
    @GetMapping("/findbylastname/{lastname}")
    public List<Employee> retreivbylastname(@PathVariable("lastname") String lastname){

        return employeeDao.findByLastName(lastname);
    }
}
