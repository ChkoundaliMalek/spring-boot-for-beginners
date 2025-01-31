package com.example.demo.student;


import java.time.LocalDate;
import java.util.List;


public interface StudentService {
    Student save(Student s);
    public List<Student> findallstudents();
    Student findByEmail(String email);
    Student update(Student s);
    void delete(String email);

}
