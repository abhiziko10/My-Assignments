package october_DAY15;

import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
     List<Integer>list=new ArrayList<>();
     list.add(2);
     list.add(3);
     list.add(10);
     list.add(8);
     list.add(6);
     MaxMin.miniMaxSum(list);
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum=0;
    for(int i=0;i<arr.size();i++){
        sum=sum+arr.get(i);
        }

        long max= Collections.max(arr);
        long min=Collections.min(arr);
        System.out.println((sum-max)+ " " +(sum-min));
    }

}
