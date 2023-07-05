package com.Assignment.UniversityEvent.controller;

import com.Assignment.UniversityEvent.model.Student;
import com.Assignment.UniversityEvent.model.Type;
import com.Assignment.UniversityEvent.service.StudentSevice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Validated
public class StudentController {
    @Autowired
    StudentSevice eventSevice;
/*Add student
update student department
delete student
Get all students
Get student by Id
Add event
Update event
Delete event
Get All events by date*/
    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return eventSevice.addStudent(student);
    }
    @PostMapping("update/deft/{studentId}")
    public Optional updateByDeft(@RequestBody Type deft, @PathVariable Integer studentId){
        return eventSevice.updateByDeft(deft,studentId);
    }
    @GetMapping("getAll/Student")
    public Iterable<Student> getAllStudent(){
        return eventSevice.getAllStudent();
    }
    @GetMapping("get/id/{studentId}")
    public Optional getStudentById(@PathVariable @Valid Integer studentId ){
        return eventSevice.getStudentById(studentId);
    }


}
