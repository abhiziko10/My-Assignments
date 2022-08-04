
/*
2) Count the total number of vowels and consonants in a string
 */






package DAY_13_CORE_JAVA;

import java.util.Locale;

public class CountVowelConsonants
{

    public static void main(String[] args) {
        int vow_count=0,con_count=0;
        String str="Eat Sleep Code Repeat";
        String str1 = str.toLowerCase();

        for(int i = 0; i < str1.length(); i++) {
            //Checks whether a character is a vowel
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                //Increments the vowel counter
                vow_count++;
            }
            //Checks whether a character is a consonant
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                //Increments the consonant counter
                con_count++;
            }
    }
        System.out.println("Number of vowels: " + vow_count);
        System.out.println("Number of consonants: " +con_count);
    }
}

//output:
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=57358:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_13_CORE_JAVA.CountVowelConsonants
Number of vowels: 8
Number of consonants: 6

Process finished with exit code 0

 */