/*
Create an abstract class shape with abstract method void area(); create 4 more classes circle, cylinder,
 square and rectangle
shape
circle
cylinder
square
rectangle
SHAPE is parent for circle and square, and circle is parent for cylinder,rectangle is child
of square.
 Override the area() in all the classes Create an array of references of type shape
 in TestShape class and print the area of different types of shapes.
 */


package DAY_8_COREJAVA_ASSIGNMENT1;

import java.awt.*;
import java.util.Random;

abstract class Shape {
    abstract void area();
}
    class square extends Shape{
        void area(){
            int length=24;
            int breadth=20;
            System.out.println("The area of Square is"+(length*breadth));
        }
    }
    class Circle extends Shape{
        void area(){
            int radius =10;
            float area_circle=(float)Math.PI*radius*radius;
            System.out.println("The area of circle is"+area_circle);
        }
    }
    class cylinder extends Circle{
        void area(){
            int radius=10;
            int height=40;
            float area_cylinder=(float)(2*Math.PI*radius*height);
            System.out.println("The area of the cylinder is "+area_cylinder);
        }

    }
    class rectangle extends square{
        void area(){
            int length=40;
            int breadth=20;
            System.out.println("The area of Rectangle is"+(length*breadth));

    }
}

public class test_shape {
    public static void main(String[] args) {
        Shape shape[]=new Shape[10];
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
            int shapes_type=r.nextInt(4);
          switch(shapes_type){
              case 0:
                  shape[i]=new Circle();
                   break;
              case 1:
                  shape[i]=new square();
                  break;
              case 2:
                  shape[i]=new rectangle();
                  break;
              case 3:
                  shape[i]=new cylinder();
                  break;

          }

        }
        for(int i=0;i<shape.length;i++){
            shape[i].area();
        }

    }
}



/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=64144:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_8_COREJAVA_ASSIGNMENT1.test_shape
The area of Rectangle is800
The area of Rectangle is800
The area of Square is480
The area of Square is480
The area of Rectangle is800
The area of circle is314.15927
The area of Square is480
The area of the cylinder is 2513.2742
The area of Square is480
The area of Square is480

Process finished with exit code 0
 */