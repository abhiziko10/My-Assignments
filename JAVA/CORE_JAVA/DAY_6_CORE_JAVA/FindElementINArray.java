package DAY_6_CORE_JAVA;
import java.util.*;

public class FindElementINArray {
    public static void main(String[] args) {
        // Declare any Array
        int[] ar = {15,17,8,25,9,30};
        Arrays.sort(ar);
        Scanner sc = new Scanner(System.in);
        // Enter position of element
        System.out.print("Enter nth position of element: ");
        int pos = sc.nextInt();
        // Check user given position is valid or not
        System.out.println(pos+ "Largest Element is "+ ar[ar.length-pos]);
        }

    }


//THE OUTPUT OF THE PROGRAM IS
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=52590:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_6_CORE_JAVA.FindElementINArray
//Enter nth position of element: 6
//6Largest Element is 8
