package com.coditas.StudentManagementAPI.Services;

import com.coditas.StudentManagementAPI.Entities.Address;
import com.coditas.StudentManagementAPI.Entities.Student;
import com.coditas.StudentManagementAPI.utils.GetSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAOImplementation implements StudentDAO{
    @Override
    public void registerStudent(Student student) {

        SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address = student.getStudentTemporaryAddress();
        session.save(address);
        session.save(student);
        transaction.commit();
        session.close();
    }

    @Override
    public void deleteStudent(int studentId) {
        SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class, studentId);
        System.out.println(student);
        session.delete(student.getStudentTemporaryAddress());
        session.delete(student);
        transaction.commit();
        session.close();

    }

    @Override
    public List<Student> showAllStudents() {
        SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Student> studentList = session.createQuery("from Student").list();

        return studentList;
    }

    @Override
    public void updateStudent(Student student) {
        SessionFactory sessionFactory = GetSessionFactory.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction= session.beginTransaction();

        session.saveOrUpdate(student.getStudentTemporaryAddress());
        session.saveOrUpdate(student);
        transaction.commit();

    }
}
