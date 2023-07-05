package com.Assignment.UniversityEvent.service;

import com.Assignment.UniversityEvent.model.Student;
import com.Assignment.UniversityEvent.model.Type;
import com.Assignment.UniversityEvent.reporitory.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentSevice {
    @Autowired
    StudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student Added !!";
    }

    public Optional updateByDeft(Type deft, Integer studentId) {
        Optional student=getStudentById(studentId);
        //Student student=studentRepo.findByStudentId(studentId);
        student.setDepartment(deft);
        return studentRepo.save(student);

    }

    public Iterable<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentById(Integer studentId) {
        return studentRepo.findById(studentId);
    }
}
