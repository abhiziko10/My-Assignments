//Convert String data into array and present it

package DAY_13_CORE_JAVA;


public class StringToArray {
    public static void main(String[] args) {
        String str="I love all the JAVA people";
        String[] array=null;

        //White space is used as a delimiter
        array=str.split("");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i].toString());
        }
    }
}

//OUTPUT IS:
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=58132:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_13_CORE_JAVA.StringToArray
I
love
all
the
JAVA
people

Process finished with exit code 0
 */