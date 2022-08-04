//4.)Remove both leading and trailing white space characters from the given string and
//also showcase the Unicode value of the character present at index 5.

package DAY_13_CORE_JAVA;

public class LeadingTrailingSpace {
    public static void main(String[] args) {
        String str="  Its fun learning from Aarti Mam  ";
        int result=str.codePointAt(4);
        //Remove both leading and trailing white space characters
        String trimmedString=str.trim();
        System.out.println(trimmedString);
        System.out.println(result);
    }
}

//OUTPUT
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=58212:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_13_CORE_JAVA.LeadingTrailingSpace
Its fun learning from Aarti Mam
115
Process finished with exit code 0
 */
