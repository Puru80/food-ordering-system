package com.bros.foodorderingsystem.api.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateStudentResponse {

    private String studentId;
    private String name;
    private String email;

}
