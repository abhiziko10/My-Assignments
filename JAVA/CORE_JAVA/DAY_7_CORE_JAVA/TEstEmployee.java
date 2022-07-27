//Create class WageEmployee extending Employee class with attributes as hrs (int)and rate(int) and method computeSalary() to calculate the salary.
//Print the salary and details of WageEmployee (Note: Use the previous Employee classes Accept the values from the user Default, Parameterised Constructor and toString() to be written in all the classes)
//2. Create SalesPerson class extending WageEmployee with attributes as sales(int) and commission (int)
//Override the ComputeSalary() in Salesperson class and print the salary and details of SalesPerson
//3 Create Manager class extending Employee class with attributes as fixed salary(int) and incentives(int) and method computeSalary() to calculate the salary of Manager Print the salary and details of Manager
//4. Write a TestEmployee class to print the details of all types of employees (use array[] of Employee class)


package DAY_7_CORE_JAVA;

class Employee{
    int Empl_ID;
    String name;
Employee(int ID,String Emp_name){
    this.Empl_ID=ID;
    this.name=Emp_name;
}
void computeSalary(){
        System.out.println("Employee id:"+Empl_ID + "NAme of employee is :"+ name );
    }
}
class Wage_employee extends Employee{
    int rate;
    int hrs;

    Wage_employee(int ID, String Emp_name, int rate, int hrs) {
        super(ID, Emp_name);
        this.rate = rate;
        this.hrs = hrs;
    }

     void computeSalary(int ID,String name,int rate,int hrs){
        super.computeSalary();
        int Compute_salary=rate*hrs;
        System.out.println("The salary of the Employer is:: "+Compute_salary);
    }

}
class  SalesPerson extends Wage_employee {
    int sales;
    int commission;

    SalesPerson(int ID, String Emp_name, int rate, int hrs, int sales, int commission) {
        super(ID, Emp_name, rate, hrs);
        this.sales = sales;
        this.commission = commission;
    }

    public void computeSalary() {
        super.computeSalary();
        System.out.println("The salary of the Employer is:: " + sales + commission);

    }

}

    class Manager extends Employee{
        int fixedSalary,incentives;

        Manager(int ID, String Emp_name, int fixedSalary,int incentives) {
            super(ID, Emp_name);
            this.fixedSalary = fixedSalary;
            this.incentives = incentives;
        }

        public void computeSalary(int fixedSalary,int incentives){

            System.out.println("The salary of the Employer is:: "+fixedSalary+incentives);
        }
    }


public class TEstEmployee {
    void show(Employee e[])
    {
        for(int i=0;i<e.length;i++){
            e[i].computeSalary();
        }
    }
    public static void main(String args[]){
 Employee employee=new Wage_employee(3,"Aritra",24,45);
 employee.computeSalary();

    Wage_employee wage_employee = new SalesPerson(1,"Abhishek",10,200,100,1000);
    wage_employee.computeSalary();
Employee emp=new SalesPerson(2,"ziko",15,22,100,1000);
emp.computeSalary();
Employee employee1 = new Manager(4,"Anwesha",10000,1000);
employee1.computeSalary();
Employee e[]= new Employee[3];
e[0]=employee;
e[1]=employee1;
e[2]=emp;
new TEstEmployee().show(e);

    }
}
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=56316:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_7_CORE_JAVA.TEstEmployee
Employee id:3NAme of employee is :Aritra
Employee id:1NAme of employee is :Abhishek
The salary of the Employer is:: 1001000
Employee id:2NAme of employee is :ziko
The salary of the Employer is:: 1001000
Employee id:4NAme of employee is :Anwesha
Employee id:3NAme of employee is :Aritra
Employee id:4NAme of employee is :Anwesha
Employee id:2NAme of employee is :ziko
The salary of the Employer is:: 1001000

 */


