package Model;

public class Student
{
    private int studentRoll;
    private String studentName;
    private String studentDivision;
    private int age;
    private String address;
    private Subject subject;


    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDivision() {
        return studentDivision;
    }

    public void setStudentDivision(String studentDivision) {
        this.studentDivision = studentDivision;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentRoll=" + studentRoll +
                ", studentName='" + studentName + '\'' +
                ", studentDivision=" + studentDivision +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", subject=" + subject +
                '}';
    }
}
