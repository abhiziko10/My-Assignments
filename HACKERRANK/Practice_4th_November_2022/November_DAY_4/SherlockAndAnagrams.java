//https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?isFullScreen=true
/*
Two strings are anagrams of each other if the letters of one string can be
rearranged to form the other string. Given a string. find the number of
pairs of substrings of the string that are anagrams of each other.
Example
s mom
The list of ll anagrammatic pairs is (m, m], [mo, om] at positions
[IO), 12]. [0, 1], [1, 2]] respectively.
Function Description
Complete the function sherlockAndAnagrams in the editor below.
sherlockAndAnagrams has the following parameter(S):
string s: a string
Returns
int: the number of unordered anagrammatic pairs of substrings in s
Input Format
The first line contains an integer q. the number of queries.
next a lines contains a string.s to. ana

Sample Input 1
2
ifailuhkqq
kkkk
Sample Output 1
3
10
Explanation 1
For the first query, we have anagram pairs [i, i], Ig, g] and [ifa, fai] at
positions [[0], 3], 18], [9]] and [0, 1,2], [1,2,3]] respectively.
For the second query:
There are 6 anagrams of the form k, k} at positions
[O), [1], [0), [2|1, |[0], 3|, [(4), /2]1, [1), 13|] and [|2], 3|]
There are 3 anagrams of the form kk, kk] at positions
[0, 1, [1,2]. |[0, 1], [2, 3]] and [[1, 2], 2,3]]
There is 1 anagram of the form kkk, kkk] at position [[0, 1, 2], [1, 2,3]]
 */




package November_DAY_4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAndAnagrams {
    public static void main(String[] args) {
        System.out.println(SherlockAndAnagrams.sherlockAndAnagrams("abba"));
    }
    public static int sherlockAndAnagrams(String anagram){
        Map<String,Integer> hashMap=new HashMap<String,Integer>();
        for(int i=0;i<anagram.length();i++){
                for(int j=i;j<anagram.length();j++){
                char[]charArray=anagram.substring(i,j+1).toCharArray();
                Arrays.sort(charArray);
                String newAnagram=new String(charArray);
                if(hashMap.containsKey(newAnagram)){
                    hashMap.put(newAnagram, hashMap.get(newAnagram)+1);
                }else{
                    hashMap.put(newAnagram,1);
                }
            }
        }
        int anagramPairs=0;
        for(String str: hashMap.keySet()){
            int  count=hashMap.get(str);
             anagramPairs+=(count*(count-1))/2;
        }
        return anagramPairs;
    }
}
