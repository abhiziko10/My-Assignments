package DAY_9_CORE_JAVA;
 class Car{
    public void wheels(){
        System.out.println("There are two wheels ");
    }
}
class Auto extends Car{
     public void wheels(){
         System.out.println("There are 3 wheels");
     }
}
public class Question_4 {
    public static void main(String[] args) {
        Car car;
        car=new Auto();
        car.wheels();



    }
}
 //THE OUTPUT IS:

/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=52283:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_9_CORE_JAVA.Question_4
There are 3 wheels

Process finished with exit code 0
 */