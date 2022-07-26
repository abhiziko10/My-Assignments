package DAY_6_CORE_JAVA;
import java.util.Arrays;
public class Array {
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6};
            //converting arrays into list
             Arrays.toString(arr);
            System.out.println("The Integer Array as a List = "+Arrays.asList(arr));

               //sorting of arrays
                Arrays.sort(arr);
                        int arr_element = 5;
            //sorting of the array i.e,Binary Search
                                System.out.println(arr_element+" is found at index = " +Arrays.binarySearch(arr,arr_element));
            // static <T> int binarySearch(T[] an int fromIndex, int toIndex, T key, Comparator<T> c): This method would
        // search the range of mentioned array for a specified object making use of binary search algorithm.
                 Arrays.sort(arr);
                 int ele=6;
                  System.out.println ( ele
                          + " is found at index = "
                          + Arrays.binarySearch(arr, 1, 3, ele));
        // this is to showcase compareUnsigned() method
        int  m[] = {10,11,12,13,14};
        int n[] = {20,30,40,50,60};
// as 10 less than 20, the output would be a value less than zero
        System.out.println(Arrays.compare(m,n));

        //copy method copies the mentioned array, truncates it or pads it with a default value but only if necessary so
        // that copy has got the mentioned length.
        System.out.println("Integer Array is: "
                + Arrays.toString(Arrays.copyOf(arr, 10)));


        }
    }

    //THE OUTPUT OF THE PROGRAM IS:-
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=53129:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_6_CORE_JAVA.Array
//The Integer Array as a List = [[I@6d03e736]
//5 is found at index = 4
//6 is found at index = -4
//-1
//Integer Array is: [1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
//
//Process finished with exit code 0