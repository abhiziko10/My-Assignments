//3) Remove all repeated characters from a given string.


package DAY_13_CORE_JAVA;
import java.util.Arrays;
public class Remove_Duplicate_char
{
    public static void removeDuplicates(String str){
    //Creating an empty string
        String newstr = new String();
        int length = str.length();

        //checking for the repeated characters
        for (int i = 0; i < length; i++)
        {
            // store the character available at ith index in the string
            char charAtPosition = str.charAt(i);


            if (newstr.indexOf(charAtPosition) < 0)
            {
                newstr += charAtPosition;
            }
        }

        System.out.println(newstr);
    }

    public static void main(String[] args) {
        // Create a string variable with default value
        String str = "javaaaa isssss love";
        //call removeDuplicates() method for removing duplicate characters
        removeDuplicates(str);

    }
}


//OUTPUT:-
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=58007:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_13_CORE_JAVA.Remove_Duplicate_char
//jav isloe
//
//Process finished with exit code 0