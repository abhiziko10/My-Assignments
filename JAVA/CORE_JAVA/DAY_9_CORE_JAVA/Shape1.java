package DAY_9_CORE_JAVA;
abstract class shape{
    abstract void area(int...sides);
}
class Circle extends shape{
    void area(int... sides){
        System.out.println("area of circle " +(Math.PI) * sides[0] * sides[0]);
    }
}
class Rectangle extends shape{
    void area(int... sides){
        System.out.println("area of rectangle is " +sides[0] * sides[1]);
    }
}
class Triangle extends shape{
    void area(int... sides){
        System.out.println("The area of triangle is " +0.5 * sides[0] * sides[1]);
    }
}
public class Shape1 {
    public static void main(String[] args) {
        shape s;
        s=new Circle();
        s.area(10);
        s=new Rectangle();
        s.area(20,40);
        s=new Triangle();
        s.area(10,20);
    }
}


//The output is:
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=52765:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_9_CORE_JAVA.Shape1
area of circle 314.1592653589793
area of rectangle is 800
The area of triangle is 100.0

Process finished with exit code 0

 */