package DAY_6_CORE_JAVA;
 class arr_functions{
public void copy(){
    int arr1[]={2,3,4,5,6};
    int arr2[] = new int[arr1.length];
    System.arraycopy(arr1,0,arr2,0,5);
    System.out.println("the copy of arr1[] is ");
    for(int i=0;i<arr2.length;i++)
        System.out.println(arr2[i]+ " ");

     }
}
public class copy_array {
public static void main(String args[]){
arr_functions ar=new arr_functions();
ar.copy();
}
}
//The output of the program is

//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=50755:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_6_CORE_JAVA.copy_array
        //the copy of arr1[] is
       // 2
       // 3
       // 4
       // 5
       // 6
