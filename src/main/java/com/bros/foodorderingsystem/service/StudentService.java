package com.bros.foodorderingsystem.service;

import com.bros.foodorderingsystem.api.request.CreateStudentRequest;
import com.bros.foodorderingsystem.exception.ApplicationError;
import com.bros.foodorderingsystem.model.tables.pojos.Student;
import com.bros.foodorderingsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(CreateStudentRequest createStudentRequest) throws ApplicationError {
        return studentRepository.createStudent(createStudentRequest);
    }

}
