package com.djouablia.rest_crud.DAO;

import com.djouablia.rest_crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    private EntityManager entityManager;

@Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        // Create a query to retrieve all students and order them by last name
        TypedQuery<Employee> typedQuery = entityManager.createQuery("FROM Employee ORDER BY lastName ASC", Employee.class);
        return typedQuery.getResultList();

    }

    @Override
    public List<Employee> findByLastName(String lastName) {
        // Create a query to retrieve students with a specific last name
        TypedQuery<Employee> typedQuery = entityManager.createQuery("FROM Employee WHERE lastName = :theData", Employee.class);
        typedQuery.setParameter("theData", lastName);
        return typedQuery.getResultList();
    }
}
