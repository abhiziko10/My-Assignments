/*
Link:https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=true
Sam's house has an apple tree and an orange tree that yield an abundance
of fruit. Using the information given below, determine the number of
apples and oranges that land on Sam's house.
In the diagram below
The red region denotes the house, where s is the start point, and tis
the endpoint. The apple tree is to the left of the house, and the orange
tree is to its right.
Assume the trees are located on a single point, where the apple tree is
at point a. and the orange tree is at point b.
When a fruit falls from its tree, it lands d units of distance from its tree
of origin along the w-axis. *A negative value of d means the fruit fell d
units to the tree's left. and a positive value of d means it falls d units to
the tree's right. *

Given the value of d for m apples and n oranges, determine how many
apples and oranges will fall on Sam's house (i.e., in the inclusive range
,t}?
For example, Sam's house is between s = 7 and t = 10. The apple tree is
located at a = 4 and the orange at b = 12. There are m = 3 apples and
n = 3 oranges. Apples are thrown apples = [2,3,-4] units distance
from a, and oranges = 3,-2,-4 units distance. Adding each apple
distance to the position of the tree, they land at
[4 +2,4+3, 4+-4 = [6,7,0]. Oranges land at
[12 +3, 12 +-2, 12 +-4 = [15, 10, 8]. One apple and two oranges
land in the inclusive range 7- 10 so we print
 */






package October_DAY17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleOranges {
    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>(Arrays.asList(2,3,-4));
        List<Integer>list1= new ArrayList<>(Arrays.asList(3,-2,-4));
        AppleOranges.countApplesAndOranges(7,10,4,12,list,list1);

    }
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
              int appleDistance=0,orangeDistance=0;
              int count=0,count1=0;

          for(int i=0;i<apples.size();i++){
               appleDistance= apples.get(i)+a;
              if(appleDistance>=s && appleDistance<=t){
                  count++;

              }

          }
        System.out.println(count);
        for(int j=0;j<oranges.size();j++){
            orangeDistance= oranges.get(j)+b;
            if(orangeDistance>=s && orangeDistance<=t){
                count1++;
            }
        }
        System.out.println(count1);

    }
}
