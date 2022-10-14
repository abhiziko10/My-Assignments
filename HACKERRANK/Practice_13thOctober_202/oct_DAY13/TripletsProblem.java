/*
Link:https://www.hackerrank.com/challenges/compare-the-triplets/problem




Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale
from 1 to 100 for three categories: problem clarity, originality, and difficulty.
The rating for Alice's challenge is the triplet a = (a[01, a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[O], b[1],
b[2).
The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
If all>b[i), then Alice is awarded 1 point.
If all< b[i), then Bob is awarded 1 point.
If atl=b[i), then neither person receives a point.
Comparison points is the total points a person earned.
Given a and b, determine their respective comparison points.
Example
a = [1,2, 3]
b= [B, 2,1]
For elements *0*, Bob is awarded a point because a[0].

If al <b[D then Bob is awarded 1 point
If al-bl then neither person receives a point
Comparison points is the total points a person earned.
Given a and b, determine their respective comparison points.
Example
a-[1,2.3
b [3,2,1]
For elements *0, Bob is awarded a point because a[0]
For the equal elements a[] and b[1] no points are earned.
Finally, for elements 2, a[2] > b[2] so Alice receives a point.
The return array is [1, 1] with Alice's score first and Bob's second.
Function Description
Complete the function compare Triplets in the editor below.
compareTriplers has the following parameters
int a3 Alice's challenge rating
int b[3): Bob's challenge rating
Return
int[2: Alice's score is in the first position, and Bob's score is in the second
Input Format
The first line contains 3 space-separated integers, a[0], a1], and a[2], the respective values in triplet a
The second line contains 3 space-separated integers, b[O], b[1]. and b[2], the respective values in triplet b.
Constraints
1sals 100
1s Ds 100

 */





package oct_DAY13;




import java.util.ArrayList;
import java.util.List;

public class TripletsProblem {
    public static void main(String[] args) {
        List<Integer>a=new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        List<Integer>b=new ArrayList<>();
        b.add(3);
        b.add(1);
        b.add(4);
        b.add(4);
        b.add(5);
        System.out.println(TripletsProblem.compareTriplets(a,b));
    }


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alice=0;
        int bob=0;
        List<Integer> category=new ArrayList<Integer>();
        if(a.size()==b.size()) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i))
                    alice++;
                if (a.get(i) < b.get(i))
                    bob++;
            }
        }else{
            System.out.println("please enter the correct size for both lists");
        }
        category.add(alice);
        category.add(bob);
        return category;

    }

}
