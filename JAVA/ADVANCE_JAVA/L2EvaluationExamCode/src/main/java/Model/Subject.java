package Model;

public class Subject {

    private int subjectId;
    private String subjectName;
    private double subjectMarks;
    private int studentRoll;

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectiId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public double getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(double subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectiId=" + subjectId +
                ", subjectName='" + subjectName + '\'' +
                ", subjectMarks=" + subjectMarks +
                ", studentRoll=" + studentRoll +
                '}';
    }
}
