package com.coditas.StudentManagementAPI.Controller;

import com.coditas.StudentManagementAPI.Entities.Student;
import com.coditas.StudentManagementAPI.Services.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MyController {
    @Autowired
    StudentDAO studentDAO;

    @CrossOrigin
    @PostMapping("/insert")
    public void insertStudent(@RequestBody Student student){
        studentDAO.registerStudent(student);
    }
    @CrossOrigin
    @GetMapping("/showStudents")
    public List<Student> displayStudent(){
        List<Student>students=studentDAO.showAllStudents();
        return students;
    }

    @CrossOrigin
    @RequestMapping(value="/deleteStudent{studentId}",method=RequestMethod.DELETE)
     public void deleteStudent(@PathVariable int studentId){
        studentDAO.deleteStudent(studentId);
    }

    @CrossOrigin
    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student){
        studentDAO.updateStudent(student);
    }



}
