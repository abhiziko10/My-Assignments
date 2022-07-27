package DAY_6_CORE_JAVA;

public class AreaOfRectangle {
    private int length = 12;
    private int breadth = 24;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public static void main(String[] args) {
        int Area;

        //object declaration
        AreaOfRectangle areaOfRectangle = new AreaOfRectangle();

        //calculate area
        Area = (areaOfRectangle.getLength()) * (areaOfRectangle.getBreadth());
        System.out.println("The area of rectangle is : " + Area);

    }
}


//THE OUTPUT OF THE PROGRAM IS
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=51684:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_6_CORE_JAVA.AreaOfRectangle
//The area of rectangle is : 288
//
//Process finished with exit code 0




