package DAY_9_CORE_JAVA;

class Addition {
    public int add(int a, int b) {
        return a + b;

    }

    public float add(float a, float b) {
        return a + b;
    }
}
    class Varags_Addition{
        public int Varargs (int...args){
            System.out.println("argument length: " +args.length);
            int sum=0;
            for(int x: args){
                sum+=x;
            }
            return sum;
        }

    }


public class Main_Application {
    public static void main(String[] args) {
        Addition addition=new Addition();
        System.out.println("The sum from the addition class is " +addition.add(24, 24));
        System.out.println("The sum from the addition class is " +addition.add(23.3f, 34.5f));
        Varags_Addition varags_addition=new Varags_Addition();
        System.out.println("sum for varargs class is " +varags_addition.Varargs(1,2,5,7));

    }
}


//THE OUTPUT IS :
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=52535:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_9_CORE_JAVA.Main_Application
The sum from the addition class is 48
The sum from the addition class is 57.8
argument length: 4
sum for varargs class is 15

Process finished with exit code 0

 */