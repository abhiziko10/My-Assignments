package com.bean;

import com.DAO.DAOImplementation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApplication {
    public static void main(String[] args) {
        Address address=new Address();
         Employee employee=new Employee();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try{
            ApplicationContext context=new ClassPathXmlApplicationContext("SpringJT.xml");
            DAOImplementation daoImplementation=context.getBean("empDAO",DAOImplementation.class);
            JdbcTemplate jdbcTemplate=context.getBean("template",JdbcTemplate.class);
            int choice;

            do{
                System.out.println("Enter 1 for insertion");
                System.out.println("Enter 2 to delete ");
                System.out.println("Enter 3 for display");
                System.out.println("Enter 4 for update ");
                System.out.println("Enter 0 to exit");
                choice=Integer.parseInt(bufferedReader.readLine());
                 switch(choice){
                     case 1:
                         System.out.println("Enter Employee ID");
                         int id=Integer.parseInt(bufferedReader.readLine());
                         address.setEmployeeeID(id);
                         System.out.println("Enter Flat number");
                         String flatNo= bufferedReader.readLine();
                          address.setFlatNo(flatNo);
                         System.out.println("Enter the city");
                         String city= bufferedReader.readLine();
                          address.setCity(city);
                         System.out.println("Enter name");
                         String name= bufferedReader.readLine();
                         employee.setName(name);
                         System.out.println("Enter designation");
                         String designation= bufferedReader.readLine();
                         employee.setDesignation(designation);
                         //new DAOImplementation().insertAddress(address);
                         new DAOImplementation(jdbcTemplate).insertEmployee(employee,address);
                         break;
                     case 2:
                         System.out.println("Enter Employee id ");
                         id= Integer.parseInt(bufferedReader.readLine());
                         new DAOImplementation(jdbcTemplate).deleteEmployee(id);
                     case 3:
                         daoImplementation.showEmployee();
                 }
            }while(choice!=0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
