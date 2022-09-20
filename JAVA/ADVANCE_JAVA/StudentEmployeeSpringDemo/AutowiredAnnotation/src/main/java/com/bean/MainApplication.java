package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
//        System.out.println("USING SPRING");
        ApplicationContext context1=new ClassPathXmlApplicationContext("Byname.xml");
        Student student=(Student)context1.getBean("Student");
        System.out.println("USING BYNAME");
        System.out.println(student);

        Employee employee=(Employee)context1.getBean("Employee");
        System.out.println(employee);


        ApplicationContext context2=new ClassPathXmlApplicationContext("Bytype.xml");
        Student student1=(Student)context1.getBean("Student");
        System.out.println("USING BYTYPE");
        System.out.println(student);

        Employee employee1=(Employee)context1.getBean("Employee");
        System.out.println(employee);

        ApplicationContext context=new ClassPathXmlApplicationContext("ByConstructor.xml");
        Student obj=(Student) context.getBean("Student") ;
        System.out.println("USING CONSTRUCTOR");
        System.out.println(obj);

        //System.out.println("AREA OF CIRCLE USING SPRING");

        Employee obj1=(Employee) context.getBean("Employee");

        System.out.println(obj1);

    }
}
