package com.coditas.StudentManagementAPI.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @NotNull
    private int studentId;



    @NotNull
    private int studentRegistrationNo;


    private String studentFirstName;


    private String studentLastName;


    private String studentGender;

    @Column(name = "student_dob")
    private Date studentDateOfBirth;

    @Column(name = "student_department")
    private String studentDepartment;


    @Column(name = "student_percentage")
    private float studentPercentage;

    @ManyToOne(cascade = CascadeType.ALL)
    private Address studentTemporaryAddress;

    public Student(int studentId, int studentRegistrationNo, String studentFirstName, String studentLastName, String studentGender, Date studentDateOfBirth, String studentDepartment, float studentPercentage, Address studentTemporaryAddress) {
        this.studentId = studentId;
        this.studentRegistrationNo = studentRegistrationNo;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentGender = studentGender;
        this.studentDateOfBirth = studentDateOfBirth;
        this.studentDepartment = studentDepartment;
        this.studentPercentage = studentPercentage;
        this.studentTemporaryAddress = studentTemporaryAddress;
    }

    public Student() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentRegistrationNo() {
        return studentRegistrationNo;
    }

    public void setStudentRegistrationNo(int studentRegistrationNo) {
        this.studentRegistrationNo = studentRegistrationNo;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public Date getStudentDateOfBirth() {
        return studentDateOfBirth;
    }

    public void setStudentDateOfBirth(Date studentDateOfBirth) {
        this.studentDateOfBirth = studentDateOfBirth;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public float getStudentPercentage() {
        return studentPercentage;
    }

    public void setStudentPercentage(float studentPercentage) {
        this.studentPercentage = studentPercentage;
    }

    public Address getStudentTemporaryAddress() {
        return studentTemporaryAddress;
    }

    public void setStudentTemporaryAddress(Address studentTemporaryAddress) {
        this.studentTemporaryAddress = studentTemporaryAddress;
    }
}
