package DAY_8_COREJAVA_ASSIGNMENT1;
abstract class vehicle{
    abstract void engine();
}
class car extends vehicle{
    void engine(){
        System.out.println("Car has good engine");
    }
}
class truck extends vehicle{
    void engine(){
        System.out.println("Truck has bad engine");
    }
}
public class abstract_assignment {
    public static void main(String[] args) {
        vehicle v;
         v=new car();
        v.engine();
         v=new truck();
        v.engine();
    }
}
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=64224:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_8_COREJAVA_ASSIGNMENT1.abstract_assignment
Car has good engine
Truck has bad engine

Process finished with exit code 0

 */
