package com.bros.foodorderingsystem.repository;

import com.bros.foodorderingsystem.api.request.CreateStudentRequest;
import com.bros.foodorderingsystem.exception.ApplicationError;
import com.bros.foodorderingsystem.exception.ErrorDetails;
import com.bros.foodorderingsystem.model.tables.pojos.Student;
import com.bros.foodorderingsystem.model.tables.records.StudentRecord;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import static com.bros.foodorderingsystem.model.tables.Student.STUDENT;

@Slf4j
@Repository
public class StudentRepository {

    @Autowired
    DSLContext dslContext;

    public Student createStudent(CreateStudentRequest createStudentRequest) throws ApplicationError {
        StudentRecord newRecord = new StudentRecord();

        try {
            newRecord = dslContext.newRecord(STUDENT);
        } catch (Exception e) {
            log.error("Error in creating campaign", e);
            throw new ApplicationError(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorDetails.builder()
                    .code(50001)
                    .detailedMessage("Error in creating student")
                    .build()
            );
        }

        newRecord.setId(createStudentRequest.getId());
        newRecord.setName(createStudentRequest.getName());
        newRecord.setEmail(createStudentRequest.getEmail());

        int rowsInserted = newRecord.insert();

        if (rowsInserted == 0) {
//            String errorMsg = String.format("Error creating campaign of %s", request.getDescription1());
//            log.error(errorMsg);
            throw new ApplicationError(
                HttpStatus.INTERNAL_SERVER_ERROR,
                ErrorDetails.builder()
                    .code(50001)
                    .detailedMessage("Error in creating student")
                    .build()
            );
        }

        return newRecord.into(Student.class);
    }

}
