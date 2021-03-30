package com.example.demosecurity.controller;

import com.example.demosecurity.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Pana", "Atanasov"),
            new Student(2, "Dzhulian", "Ovcharov")
    );

    @GetMapping(value = "{id}")
    public Student getStudent(@PathVariable Integer id) {
        return STUDENTS.stream()
                .filter(student -> id.equals(student.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Student with id:" + id + " doest not exists"));
    }
}
