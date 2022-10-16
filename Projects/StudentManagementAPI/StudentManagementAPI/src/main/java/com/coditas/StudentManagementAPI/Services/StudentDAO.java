package com.coditas.StudentManagementAPI.Services;

import com.coditas.StudentManagementAPI.Entities.Student;

import java.util.List;

public interface StudentDAO {

    public void registerStudent(Student student);
    public void deleteStudent(int studentId);

    public List<Student> showAllStudents();

    public void updateStudent(Student student);

}
