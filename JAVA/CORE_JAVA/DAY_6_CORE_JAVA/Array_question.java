package DAY_6_CORE_JAVA;

import java.util.*;

class arr_asc_dsc {
    public void asc_dsc()

    {
        Integer[] array1 = {-5, -9, 8, 12, 1, 3};


        Arrays.sort(array1);
        //Arrays.toString(array1);
        System.out.println("The array in ascending order is " + Arrays.toString(array1));
        Arrays.sort(array1,Collections.reverseOrder());
        System.out.println( "the array in reverse order is " +Arrays.toString(array1));

        System.out.println("");
    }
}
public class Array_question {
    public static void main(String args[])
    {
        arr_asc_dsc ascDsc=new arr_asc_dsc();
        ascDsc.asc_dsc();
    }
}


//THE OUTPUT OF THE PROGRAM IS:

//The array in ascending order is [-9, -5, 1, 3, 8, 12]
//the array in reverse order is [12, 8, 3, 1, -5, -9]
//
//
//Process finished with exit code 0