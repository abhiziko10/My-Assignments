/*
//Link:https://www.hackerrank.com/challenges/pangrams/problem?isFullScreen=true
A pangram is a string that contains every letter of the alphabet. Given a
sentence determine whether it is a pangram in the English alphabet.
gnore case. Return either pangram or not pangram as appropriate.
Example
s="The quick brown fox jumps over the lazy dog'
The string contains all letters in the English alphabet, so return pangram.
Function Description
Complete the function pangrams in the editor below. It should return the
string pangram if the input string is a pangram. Otherwise, it should retur
not pangram.
pangrams has the following parameter(s):
string s: a string to test
Returns
string: either pangram or not pangram
Input Format
A single line with string s.
Constraints
0<length of s 10
Each character of s. si] E {a- z, A-2, space}
Sample Input
Sample Input 0
We promptly judged antique ivory buckles for the next prize
Sample Output 0
pangram
Sample Explanation 0
All of the letters of the alphabet are present in the string
Sample Input 1
We promptly judged antique ivory buckles for the prize
Sample Output 1
not pangram
Sample Explanation 0
The string lacks an x.

 */



package November_DAY_4;

import java.util.Set;
import java.util.TreeSet;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(Pangrams.pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
    public static String pangrams(String userString){
        String string=userString.toLowerCase();
        Set<Character> set=new TreeSet<Character>();
        for(int i=0;i<string.length();i++){
            set.add(string.charAt((i)));
        }

        if(set.size()==26)
            return "pangram";
        else
            return "not panagram";
    }
}
