package com.djouablia.rest_crud;

import com.djouablia.rest_crud.DAO.EmployeeDao;
import com.djouablia.rest_crud.entity.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RestCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestCrudApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(EmployeeDao employeeDao){
        return runner ->{
            retrievAllEmployee(employeeDao);

        };

    }

    private void retrievAllEmployee(EmployeeDao employeeDao) {
        List<Employee>  emplyeis = employeeDao.findAll();
        for (Employee employee : emplyeis){
            System.out.println(employee);

        }
    }
}
