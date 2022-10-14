/*
Link:https://www.hackerrank.com/challenges/diagonal-difference/problem


Given a square matrix, calculate the absolute difference between the sums of its diagonals.
For example, the square matrix arr is shown below:
1 2 3
45 b
8 9
The left-to-right diagonal = 1 + 5 +9=15. The right to left diagonal = 3 +5 +9=17. Their absolute difference is
|15 17= 2.
Function description
Complete the diagonalDifference function in the editor below.
diagonalDifference takes the following parameter:
int arrin][m]: an array of integers
Return
int: the absolute diagonal difference
Input Format
The first line contains a single integer, 7, the number of rows and columns in the square matrix arr.
 */







package october_DAY14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>>list= new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(new Integer[]{8,2,3,5})));
        list.add(new ArrayList<>(Arrays.asList(new Integer[]{5,6,2,4})));
        list.add(new ArrayList<>(Arrays.asList(new Integer[]{1,4,3,7})));
        list.add(new ArrayList<>(Arrays.asList(new Integer[]{4,2,3,4})));
        System.out.println(DiagonalDifference.diagonalDifference(list));
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumD1=0;
        int sumD2=0;

        for(int i=0;i<arr.size();i++){
            sumD1+=arr.get(i).get(i);
            sumD2+=arr.get(i).get((arr.get(i).size()-1)-i);
        }
        return Math.abs(sumD1-sumD2);

    }
}

