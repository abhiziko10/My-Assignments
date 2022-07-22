package DAY_4_CORE_JAVA;
import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        // Declaring and initializing variable to

        int num = 5;

        int i = num, j;

        // Nested while loops
        // Outer loop

        // Till condition satisfied
        while (i > 0) {
            j = 0;


            // cheking Condition check
            while (j++ < num - i) {
                // Print whitespaces
                System.out.print(" ");
            }

            j = 0;

            // Inner loop
            // Condition check
            while (j++ < (i * 2) - 1) {
                // Print star
                System.out.print("*");
            }

            // so next line
            System.out.println();

            // reversing the pyramid value
            i--;
        }
    }
}
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=49873:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_4_CORE_JAVA.Pattern
//*********
// *******
//  *****
//   ***
//    *
//
//Process finished with exit code 0