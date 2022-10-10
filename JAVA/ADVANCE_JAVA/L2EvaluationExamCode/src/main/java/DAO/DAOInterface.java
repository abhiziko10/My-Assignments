package DAO;

import Model.Student;
import Model.Subject;

import java.util.List;

public interface DAOInterface {

    public int insertStudent(Student student);
    public int insertSubject(Subject subject);
    public int deleteStudent(int studentRoll);
    public List<Student> showAllStudent();
}
