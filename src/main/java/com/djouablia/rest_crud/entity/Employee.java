package com.djouablia.rest_crud.entity;

import jakarta.persistence.*;

@Entity  // Indicates that this class is a JPA entity, which represents a database table.
@Table(name = "employee")  // Specifies the name of the database table associated with this entity.

public class Employee {
    // Fields (Attributes) of the Student Entity

    @Id  // Marks this field as the primary key of the database table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Specifies how the primary key values are generated (auto-increment).
    @Column(name = "id")  // Maps this field to the 'id' column in the database table.
    private int id;

    @Column(name = "first_name")  // Maps this field to the 'first_name' column in the database table.
    private String firstName;

    @Column(name = "last_name")  // Maps this field to the 'last_name' column in the database table.
    private String lastName;

    @Column(name = "email")  // Maps this field to the 'email' column in the database table.
    private String email;

    // Constructors

    // Default constructor
    public Employee() {
    }

    // Constructor with parameters for creating Student instances
    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters and Setters for the fields

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ToString Method for displaying the Student object as a string

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
