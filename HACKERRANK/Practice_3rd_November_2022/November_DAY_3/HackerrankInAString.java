/*
//Link:https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true
We say that a string contains the word hacker rank if a subsequence of its
characters spell the word hackerrank. Remeber that a subsequence
maintains the order of characters selected from a sequence.
More formally, let p[0], P[1],.., P[9] be the respective indices of h, a, c.
k. e, r, r. a, n. k in string s. lf p[0] < pl1 <P/2<<p9 is true.
then s contains hackerrank.
For each query, print YES on a new line if the string contains hackerrank,
otherwise, print NO.
Example
s haacckkerrannkk
This contains a subsequence of all of the characters in the proper order.
Answer YES
s = haacckkerannk
This is missing the second 'r'. Answer NO.
s hccaakkerrannkk
There is no 'c' after the first occurrence of an 'a', so answer NO.
Function Description
Complete the hackerranklnString function in the editor beloW.
hackerrankinstring has the following parameter(s)
string s: a string
Returns
string: YES or NO
Input Format
The first line contains an integer q. the number of queries.
Each of the next q lines contains a single query string s.
Constraints
2q 10
10 length of s 104
Sample Input 0
2
hereiamstacke rrank
hackerworld
Sample Output 0
YES
NO
Explanation 0
We perform the following q = 2 queries:
1.8 = hereiamstackerrank
The characters of hackerrank are bolded in the string above. Because
the string contains all the characters in hackerrank in the same exact
order as they appear in hackerrank, we return YES.
2.s= hackerworld does not contain the last three characters of
hackerrank, so we return No.
 */



package November_DAY_3;

public class HackerrankInAString {
    public static void main(String[] args) {
        System.out.println(HackerrankInAString.hackerrankInString("hackerworld"));
    }
    public static String hackerrankInString(String query){
        String newString="Hackerrank";
        int count=0;
        for(int i=0;i<query.length();i++){
            if(count==8)
                break;
            if(query.charAt(i)==newString.charAt(count))
                count++;

        }
        if(count==8)
            return"YES";
        else
            return"NO";
    }
}
