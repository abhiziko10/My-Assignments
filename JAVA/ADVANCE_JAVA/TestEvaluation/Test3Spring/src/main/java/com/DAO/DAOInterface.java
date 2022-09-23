package com.DAO;

import com.bean.Address;
import com.bean.Employee;

public interface DAOInterface {
    public int insertEmployee(Employee employee,Address address);
    public int insertAddress(Address address);
    public int updateEmployee(String city,float salary);
    public int deleteEmployee(int EmployeeID);
    public void showEmployee();
}
