package DAO;

import Model.Student;
import Model.Subject;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAOImplementation implements DAOInterface{
    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertStudent(Student student) {
        return jdbcTemplate.update("insert into Student values(?,?,?,?,?)",student.getStudentRoll(),
                student.getStudentName(),student.getStudentDivision(),student.getAge(),student.getAddress());
    }

    @Override
    public int insertSubject(Subject subject) {
        return jdbcTemplate.update("insert into Subject values(?,?,?,?)",subject.getSubjectId(),
                subject.getSubjectName(),subject.getSubjectMarks(),subject.getStudentRoll());
    }

    @Override
    public int deleteStudent(int studentRoll) {
        return jdbcTemplate.update("delete from Student where srollNo=?",studentRoll);

    }

    @Override
    public List<Student> showAllStudent() {
        String query="select s.srollNo,s.sName,s.sDiv,s.sAge,s.sAddress,su.subId,su.subName,su.subMarks from Student " +
                "s inner join Subject su on s.srollNo=su.srollNo";
        Subject subject=new Subject();
       List<Student>studentList=jdbcTemplate.query(query, new RowMapper<Student>() {
           @Override
           public Student mapRow(ResultSet resultSet, int i) throws SQLException {
                Student student=new Student();
                student.setStudentRoll(resultSet.getInt(1));
                student.setStudentName(resultSet.getString(2));
                student.setStudentDivision(resultSet.getString(3));
                student.setAge(resultSet.getInt(4));
                student.setAddress(resultSet.getString(5));
                subject.setSubjectiId(resultSet.getInt(6));
                subject.setSubjectName(resultSet.getString(7));
                subject.setSubjectMarks(resultSet.getDouble(8));
                subject.setStudentRoll(resultSet.getInt(9));
                 student.setSubject(subject);
                 return student;
           }
       });
       return studentList;
    }
}
