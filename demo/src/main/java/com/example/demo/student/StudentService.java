package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(17L,
                "John Wick",
                "john@wick.com",
                LocalDate.of(2005, Month.APRIL, 15),
                28));
    }
}
