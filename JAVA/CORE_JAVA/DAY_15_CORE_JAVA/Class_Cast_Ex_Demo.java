//1)Write a code for "Class CastException'" and handle it using Exception handling
//Mechanism

package DAY_15_CORE_JAVA;
class   Vehicle{
  void show(){};
}
class Nano extends Vehicle{
  void show(){}
}
class Audi extends Vehicle{
 void show(){}
}
public class Class_Cast_Ex_Demo {
    public static void main(String[] args) {



            Vehicle vehicle = new Vehicle();
            Vehicle vehicle1 = new Nano();
            Vehicle vehicle2 = new Audi();
            //ClassCastException occuring here
            // Audi audi=new Vehicle();
            try {
                Audi audi = (Audi) vehicle;
            } catch (Exception e) {
                e.printStackTrace();

            }


        }

    }

    /*
    C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=51688:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_15_CORE_JAVA.Class_Cast_Ex_Demo
java.lang.ClassCastException: class DAY_15_CORE_JAVA.Vehicle cannot be cast to class DAY_15_CORE_JAVA.Audi (DAY_15_CORE_JAVA.Vehicle and DAY_15_CORE_JAVA.Audi are in unnamed module of loader 'app')
	at DAY_15_CORE_JAVA.Class_Cast_Ex_Demo.main(Class_Cast_Ex_Demo.java:22)

Process finished with exit code 0
     */