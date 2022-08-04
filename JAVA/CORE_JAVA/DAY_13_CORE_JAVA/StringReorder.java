
//1)Accept the strings(HARD CODE VALUES/USER ACCEPTED),as per their length and
//reorder it.



package DAY_13_CORE_JAVA;



public class StringReorder {
    public static void sortArray(String[] names){
        for (int i = 1; i<names.length; i++){

            String temp = names[i];
            int j = i - 1;
            while (j >= 0 && temp.length() < names[j].length())
            {
                names[j+1] = names[j];
                j--;
            }
            names[j+1] = temp;
        }


    }

    public static void main(String[] args) {
        String[] names={"Abhishek","Anuj","Zulfa","Swaraj"};
        StringReorder.sortArray(names);
        for(String name:names){
            System.out.println(name.toString());
        }
    }
}

//output:

/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=59238:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_13_CORE_JAVA.StringReorder
Anuj
Zulfa
Swaraj
Abhishek

Process finished with exit code 0

 */