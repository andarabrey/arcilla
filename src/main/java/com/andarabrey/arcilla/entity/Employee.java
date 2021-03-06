package com.andarabrey.arcilla.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @NotNull
    @Size(min = 3, message = "Minimal 3 Characters")
    @Column(name = "first_name")
    private String firstName;

    @NotNull
    @Size(min = 3, message = "Minimal 3 Characters")
    @Column(name = "last_name")
    private String lastName;

    @NotNull
    @Size(min = 8, message = "Minimal 8 Characters")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Email format invalid")
    @Column(name = "email")
    private String email;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String email) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
