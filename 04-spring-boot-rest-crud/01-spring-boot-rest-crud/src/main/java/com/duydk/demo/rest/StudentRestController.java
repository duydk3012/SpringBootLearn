package com.duydk.demo.rest;

import com.duydk.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {

        students = new ArrayList<>();

        this.students.add(new Student("John", "Doe"));
        this.students.add(new Student("Jane", "Doe"));
        this.students.add(new Student("Fer", "Doe"));
        this.students.add(new Student("Mary", "Doe"));

    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // check exception
        if ((studentId < 0) || (studentId > this.students.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student is not found - " + studentId);
        }

        return this.students.get(studentId);
    }

}






