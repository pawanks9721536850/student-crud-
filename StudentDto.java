package com.studentTask.studentProgram.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class StudentDto {
    private Integer rollNo;
    private String firstName;
    private String lastName;
    private String course;
    private String address;
}
