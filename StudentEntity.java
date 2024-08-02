package com.studentTask.studentProgram.entity;

//import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

//@Entity
// @Getter & @Setter can be used from lombok to omit the getters and setters methods , and it is applied either on each field or on the entire class
@Getter
@Setter
@Component
//@Entity
public class StudentEntity {

    //@Column
    private Integer rollNo ;
    //@Column
    private String  firstName ;
    //@Column
    private String  lastName ;
    //@Column
    private String  course ;
    //@Column
    private String  address ;

}
