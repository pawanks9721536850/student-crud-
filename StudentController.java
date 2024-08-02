package com.studentTask.studentProgram.controller;

import com.studentTask.studentProgram.dto.StudentDto;
import com.studentTask.studentProgram.entity.StudentEntity;
import com.studentTask.studentProgram.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(path="/route")
public class StudentController  {

     @Autowired
     private StudentService studentService ;



    @PostMapping(path="/addStudent")
    public String addStudent (@RequestBody StudentDto studentDto )
    {
        String s = studentService.addUserToList (studentDto ) ;
        return s ;
    }

    @GetMapping ( path = "/{rollNo}")
    public StudentDto   getStudentById(@PathVariable (value="rollNo" ) Integer rollNo )
    {
        StudentDto studentdto = new StudentDto() ;
         studentdto = studentService.getStudentByRollNoFromList(rollNo);
        return studentdto ;
    }

    @GetMapping( path ="/allStudent")
    public ArrayList<StudentDto> getAllStudent()
    {
        return studentService.getAllStudentFromList ();
    }

    @DeleteMapping(path ="/{rollNo}")
    public String deleteStudent(@PathVariable (value = "rollNo" ) Integer rollNo )
    {
       return  studentService.deleteStudentFromList(rollNo);

    }

    @PutMapping(path="/{rollNo}")
    public StudentDto updateStudent( @PathVariable (value="rollNo" ) Integer rollNo , @RequestBody StudentDto studentDto )
    {
        return studentService.updateStudentFromList( rollNo ,  studentDto );
    }



}
