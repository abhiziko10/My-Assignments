package oct_DAY13;

import java.util.ArrayList;
import java.util.List;

public class BigSum {
    public static void main(String[] args) {
        List<Long>list=new ArrayList<>();
        list.add(100111000L);
        list.add(100110022L);
        list.add(111000004L);
        list.add(111003344L);
        System.out.println(BigSum.aVeryBigSum(list));
    }



    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here

        long sum=0;
        for(Long value:ar)
        {
            sum=sum+value;
        }
        return sum;
    }

}



