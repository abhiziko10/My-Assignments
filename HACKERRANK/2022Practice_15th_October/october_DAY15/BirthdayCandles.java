
/*
Link:https://www.hackerrank.com/challenges/birthday-cake-candles/problem

YOu are in charge or the cake ror a child's birthday. YOu have decided the cake will have one candle for each year or their total
age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
Example
candles = 14,4,1,3]
The maximum height candles are 4 units high. There are 2 of them, so return 2.
Function Description
Complete the function birthdayCakeCand les in the editor below.
birthdayCake Candles has the following parameter(s):
int candles[n]: the candle heights
Returns
int: the number of candles that are tallest
Input Format
The first line contains a single integer, 7, the size of candles||.
The second line contains n space-separated integers, where each integer i describes the height of candles i
Constraints
1ng 10
1S candlesji] < 10'
Sample Input 0
2.
1. 3
Sample Output 0
2
Explanationo
Candle heights are [3,2, 1,3]. The tallest candles are 3 units, and there are 2 of them.
 */


package october_DAY15;

import java.util.*;

public class BirthdayCandles {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(4);
        System.out.println(BirthdayCandles.birthdayCakeCandles(list));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int count = 0;
//        for (int i = 0; i < candles.size(); i++) {
//            if (candles.get(i) == Collections.max(candles)) {
//                count++;
//            }
//        }
        int element = 0;
        Iterator iterator=candles.iterator();
        while(iterator.hasNext()){
            element= (int) iterator.next();
            if(element==Collections.max(candles)){
                count++;
            }
        }
        System.out.println(element);
              return count;
        

    }

}
