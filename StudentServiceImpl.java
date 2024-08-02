package com.studentTask.studentProgram.service;

import com.studentTask.studentProgram.dto.StudentDto;
import com.studentTask.studentProgram.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class StudentServiceImpl implements StudentService {
    ArrayList<StudentEntity> studentList = new ArrayList<>();


    @Override
    public String addUserToList(StudentDto studentDto) {
        StudentEntity studentEntity = new StudentEntity();

        Integer roll = studentDto.getRollNo();
        studentEntity.setRollNo(roll);
        studentEntity.setFirstName(studentDto.getFirstName());
        studentEntity.setLastName(studentDto.getLastName());
        studentEntity.setCourse(studentDto.getCourse());
        studentEntity.setAddress(studentDto.getAddress());


        studentList.add(studentEntity);

        return "new student added to the list";
    }

    @Override
    public StudentDto getStudentByRollNoFromList(Integer rollNo) {

        StudentDto studentdto = new StudentDto();
        for (Iterator<StudentEntity> itr = studentList.iterator(); itr.hasNext(); ) {

            StudentEntity s = itr.next();

            if (s.getRollNo().equals(rollNo)) {

                studentdto.setRollNo(s.getRollNo());
                studentdto.setFirstName(s.getFirstName());
                studentdto.setLastName(s.getLastName());
                studentdto.setCourse(s.getCourse());
                studentdto.setAddress(s.getAddress());
                break;
            }

        }


        return studentdto;
    }

    @Override
    public ArrayList<StudentDto> getAllStudentFromList() {

        ArrayList<StudentDto> dtoList = new ArrayList<>();

        for (StudentEntity s : studentList) {
            StudentDto studentdto = new StudentDto();

            studentdto.setRollNo(s.getRollNo());
            studentdto.setFirstName(s.getFirstName());
            studentdto.setLastName(s.getLastName());
            studentdto.setCourse(s.getCourse());
            studentdto.setAddress(s.getAddress());


            dtoList.add(studentdto);
        }
        return dtoList;
    }

    @Override
    public String deleteStudentFromList(Integer rollNo) {


        for (Iterator<StudentEntity> itr = studentList.iterator(); itr.hasNext(); ) {
            StudentEntity s = itr.next();
            if (s.getRollNo().equals(rollNo)) {
                itr.remove();
                break;
            }

        }

        return "employee deleted successfully";

    }

    @Override
    public StudentDto updateStudentFromList(Integer rollNo, StudentDto studentdto) {
        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setRollNo(studentdto.getRollNo());
        studentEntity.setFirstName(studentdto.getFirstName());
        studentEntity.setLastName(studentdto.getLastName());
        studentEntity.setCourse(studentdto.getCourse());
        studentEntity.setAddress(studentdto.getAddress());


//        for ( Iterator<StudentEntity> itr = studentList.iterator() ; itr.hasNext() ; )
//        {
//            StudentEntity s = itr.next() ;
//            if ( s.getRollNo().equals(rollNo))
//            {
//                studentList.set(  , studentEntity);
//            }
//        }

        for (int i = 0; i < studentList.size(); i++) {
            StudentEntity s = studentList.get(i);
            if (s.getRollNo().equals(rollNo)) {
                studentList.set(i, studentEntity);
            }
        }

//        for ( StudentEntity s : studentList )
//        {
//            if ( s.getRollNo().equals(rollNo) )
//            {
//                s=studentEntity ;
//            }
//        }
        return studentdto;
    }


}
