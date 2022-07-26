package DAY_6_CORE_JAVA;

import java.util.Arrays;

class remove {
    public void remove_duplicate() {
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]!=arr[i+1])
                System.out.println(arr[i]);
        }

    }
}
public class Remove_dup {
    public static void main (String args[]){
        remove r=new remove();
        r.remove_duplicate();
    }
}

//THE OUTPUT OF THE PROGRAM IS :-
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=51237:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_6_CORE_JAVA.Remove_dup
//1
//2
//3
//4
//7