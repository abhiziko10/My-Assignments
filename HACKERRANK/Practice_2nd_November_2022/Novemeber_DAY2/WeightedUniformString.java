//Link:https://www.hackerrank.com/challenges/weighted-uniform-string/problem?isFullScreen=true


/*
A weighted string is a string of lowercase English letters where each letter has a weight. Character weights are  to
from  to  as shown below:
The weight of a string is the sum of the weights of its characters. For
example:
apple
1+ 16 + 16+ 12 + 5 50
hack
8+1+3+11 23
watch
23+1+ 20+3+8 = 53
3+3+3+3+3 = 15
ccccc
aaa
1+1 1 3
zzzz
26+26 +26+ 26 = 104
A uniform string consists of a single character repeated zero or more
times. For example, ccc and a are uniform strings, but bcb and cd are
not
Given a string. s. let U be the set of weights for all possible uniform
contiguous substrings of string s. There will be n queries to answer where
each query consists of a single integer. Create a return array where for
each query, the value is Yes if query|i] € U. Otherwise, append No.
Note: The E symbol denotes that æ[] is an element of set U.
Example
8abbcccdddd'
queries= |1,7,5,4, 15).
Working from left to right, weights that exist are:
string weight
a
b
bb
4
c
CC
9
ccC
d
4
dd
8
ddd
12
dddd
16
Now for each value in queries, see if it exists in the possible string
weights. The return array is ['Yes', 'No', 'No', 'Yes', 'No '].
Function Description
Complete the weightedUniform Strings function in the editor below.
weightedUniformStrings has the following parameter(s):
string s: a string
- int queries[n]: an array of integers
Returns
- string[n]: an array of strings that answer the queries
Input Format
The first line contains a string s. the original string.
The second line contains an integer n, the number of queries.
Each of the next n lines contains an integer queries[2). the weight of a
uniform subtring of s that may or may not exist.
Constraints
1 lengthofs, n 10
1 querieslil 10
S will only contain lowercase English letters, asciifa-z].

 */




package Novemeber_DAY2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightedUniformString {
    public static void main(String[] args) {
        List<Integer>mylist=new ArrayList<>();

        mylist.add(1);
        mylist.add(3);
        mylist.add(12);
        mylist.add(5);
        mylist.add(9);
        mylist.add(10);
        System.out.println(UniformString.weightedUniformStrings("abccddde",mylist));


    }
}
class UniformString{

    public static List<String> weightedUniformStrings(String string, List<Integer> queries){
        List<String>answerList=new ArrayList<String>();
        Set<Integer> sumList=new HashSet<Integer>();
        String answer="";
        char previous=string.charAt(0);
        sumList.add(previous-'a'+1);
        int sum=(previous-'a'+1);
        for(int i=0;i<string.length();i++){
          char next= string.charAt(i);
          if(next==previous){
              sum+=(previous-'a'+1);
              sumList.add(sum);

          }else{
              sumList.add(next-'a'+1);
              previous=next;
              sum=previous-'a'+1;
          }
        }
        for(int j:queries){
            if (sumList.contains(j))
                answer="Yes";
            else
                answer="No";
            answerList.add(answer);
        }
        return answerList;
    }
}