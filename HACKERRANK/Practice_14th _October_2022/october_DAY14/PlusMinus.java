/*
link:https://www.hackerrank.com/challenges/plus-minus/problem

Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of
each fraction on a new line with6 places after the decimal.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with
absolute error of up to 10 are acceptable.
Example
arr= 1,1,0, -1,-1
There are n = 5 elements, two positive, two negative and one zero. Their ratios are=0.400000.= 0.400000 and
1
0.200000. Results are printed as:
0.400000
0.400000
0.20000o
 */







package october_DAY14;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        list.add(-1);
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(1);
        PlusMinus.plusMinus(list);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float result1=0f;
        float result2=0f;
        float result3=0f;
        float count1=0f;
        float count2=0f;
        float count3=0f;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                count1++;

            }else if(arr.get(i)<0){
                count2++;
            }else if(arr.get(i)==0){
                count3++;
            }
        }
        result1=(count1/arr.size());
        System.out.format("%1.6f",result1);
        System.out.println();
        result2=(count2/arr.size());
        System.out.format("%1.6f",result2);
        System.out.println();
        result3=(count3/arr.size());
        System.out.format("%1.6f",result3);

    }


}
