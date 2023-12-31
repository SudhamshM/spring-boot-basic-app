package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
//    injected into constructor to instantiate
    public StudentController(StudentService studentService) {
         this.studentService = studentService;
//            this.studentService = new StudentService();

    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
