package com.DAO;

import com.bean.Address;
import com.bean.Employee;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DAOImplementation implements DAOInterface

{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public DAOImplementation(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }
    public DAOImplementation(){}
    @Override
    public int insertEmployee(Employee employee,Address address) {
        int result = 0;
        try {
            jdbcTemplate.update("insert into Address values(?,?,?)",address.getEmployeeeID(),
                    address.getFlatNo(),
                    address.getCity());
            result= jdbcTemplate.update("insert into Employee values(?,?,?,?)", address.getEmployeeeID(),
                    employee.getName()
                    , employee.getDesignation(), employee.getSalary());

        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public int insertAddress(Address address) {
        int result = 0;
        try {
            result= jdbcTemplate.update("insert into Address values(?,?,?)", address.getEmployeeeID(),
                    address.getFlatNo(),
                    address.getCity());
        } catch (DataAccessException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public int updateEmployee(String city, float salary) {

        return 0;
    }

    @Override
    public int deleteEmployee(int employeeID) {
        return jdbcTemplate.update("delete from Employee where employeeID=?",employeeID);
    }

    @Override
    public void showEmployee() {
     String query="select * from Employee inner join Address on employee.EmployeeID=address.EmployeeID ";
        List<Employee>employeeList=jdbcTemplate.query(query, new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee=new Employee();
                employee.setEmployeeID(resultSet.getInt(1));
                employee.setName(resultSet.getString(2));
                employee.setDesignation(resultSet.getString(3));
                employee.setSalary(resultSet.getFloat(4));
                Address address=new Address();
                address.setEmployeeeID(resultSet.getInt(1));
                address.setFlatNo(resultSet.getString(2));
                address.setCity(resultSet.getString(3));
               employee.setAddress(address);
               return employee;
            }
        });
        for(Employee e:employeeList){
            System.out.println(e);
        }

    }
}
