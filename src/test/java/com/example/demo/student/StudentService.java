package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findallstudents(){
        return List.of(
                new Student(
                        "malek",
                        "chkoundali",
                        LocalDate.now(),
                        "malek.chkoundali@gmail.com",
                        26
                ),
                new Student(
                        "iyadh",
                        "amami",
                        LocalDate.now(),
                        "iyadh.amami@gmail.com",
                        23
                )

        );
    }
}
