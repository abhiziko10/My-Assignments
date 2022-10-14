/*

Link:https://www.hackerrank.com/challenges/simple-array-sum/problem


Given an array of integers, find the sum of its elements
For example, f the array ar =|1,2,3]14 2+3=6, so return 6.
Function Description
Complete the simpleArraySum function in the editor below. It must return the sum of the array elements a an integer.
simpleArraySum has the following parameter(s
ar an array of integers
Input Format
The first line contains an integer, 7n, denoting the ize of the array
The second line contains n space-separated integers representing the array's elements.
Constraints
0n,arlis 1000
Output Format
Print the sum of the array's elements asa single integer.
Sample input
234 1e 11
Sample Output

 */


package oct_DAY13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SimpleArraySum {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list=null;
//        SimpleArraySum.simpleArraySum(list);
//        System.out.println(SimpleArraySum.simpleArraySum(list));

        Integer i1=1000;
        Integer i2=1000;
        System.out.println(i1==i2);


    }

    public static int simpleArraySum(List<Integer> ar) {

        // Write your code here

        int sum = 0;

//        Stream stream=ar.stream();
        if (ar == null) {
            System.out.println("Please change the list value");
        } else {
            sum=ar.stream().mapToInt(s -> (int) s).sum();
        }
        return sum;

    }

}





