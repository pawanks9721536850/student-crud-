package com.studentTask.studentProgram.service;

import com.studentTask.studentProgram.dto.StudentDto;

import java.util.ArrayList;

public interface StudentService {

    public String addUserToList ( StudentDto studentDto );
    public StudentDto  getStudentByRollNoFromList ( Integer rollNo );
    public ArrayList<StudentDto> getAllStudentFromList ();
    public String  deleteStudentFromList(Integer rollNo );
    public StudentDto updateStudentFromList ( Integer rollNo , StudentDto studentDto );


}
