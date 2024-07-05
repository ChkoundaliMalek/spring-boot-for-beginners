package com.example.demo.student;

import java.util.List;

public class InMemoryStudentService implements StudentService{

    private final InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return  dao.save(s);
    }

    @Override
    public List<Student> findallstudents() {
        return dao.findallstudents();
    }

    @Override
    public Student findByEmail(String email) {
        return findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);

    }


}

