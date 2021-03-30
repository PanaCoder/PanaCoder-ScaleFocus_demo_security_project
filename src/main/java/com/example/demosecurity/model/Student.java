package com.example.demosecurity.model;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;

    public Student(Integer id,String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
