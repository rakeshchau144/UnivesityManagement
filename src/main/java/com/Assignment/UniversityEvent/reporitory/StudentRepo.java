package com.Assignment.UniversityEvent.reporitory;

import com.Assignment.UniversityEvent.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository <Student, Integer> {
    Student findByStudentId(Integer studentId);
}
