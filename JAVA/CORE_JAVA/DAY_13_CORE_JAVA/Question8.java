//8)Using Constructor try to Reinitialize values of class
//Employee(emp id,emp_name,emp_address,emp_sal)

package DAY_13_CORE_JAVA;
class Employee{
    int emp_id, emp_salary;
    String emp_name;
    String emp_address;

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_salary=" + emp_salary +
                ", emp_name='" + emp_name + '\'' +
                ", emp_address='" + emp_address + '\'' +
                '}';
    }

    public Employee(int emp_id, int emp_salary, String emp_name, String emp_address) {
        this.emp_id = emp_id;
        this.emp_salary = emp_salary;
        this.emp_name = emp_name;
        this.emp_address = emp_address;
    }
}
public class Question8 {
    public static void main(String[] args) {
        Employee employee = new Employee(1,45000,"Abhishek","Kolkata");
        System.out.println(employee);
    }

}

//OUTPUT:
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=59030:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_13_CORE_JAVA.Question8
Employee{emp_id=1, emp_salary=45000, emp_name='Abhishek', emp_address='Kolkata'}

Process finished with exit code 0

 */




