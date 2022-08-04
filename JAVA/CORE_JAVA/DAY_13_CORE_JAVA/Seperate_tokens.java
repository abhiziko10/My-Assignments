//7)Separate the tokens(operands and operators) from below statement:
//3+(20%2) (20/2)
//Case 1)Print separated tokens
//Case 2)Print Operators and Operand separately

package DAY_13_CORE_JAVA;

import java.util.StringTokenizer;

public class Seperate_tokens {
    public static void main(String[] args) {
        String str="3+(20%2) (20/2)3+(20%2) (20/2)";
        String del="+,%,/,(,)";
        StringTokenizer st=new StringTokenizer(str,del);

        while(st.hasMoreElements()){
            System.out.print(st.nextElement() + " ");
        }
        System.out.println();
        String del1="1,2,3,4,5,6,7,8,9";
        StringTokenizer st1=new StringTokenizer(str,del1);
        while(st1.hasMoreElements()){

            System.out.print(st1.nextElement() + " ");
        }
    }
}

//OUTPUT
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=58887:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_13_CORE_JAVA.Seperate_tokens
3 20 2   20 2 3 20 2   20 2
+( 0% ) ( 0/ ) +( 0% ) ( 0/ )
Process finished with exit code 0
 */