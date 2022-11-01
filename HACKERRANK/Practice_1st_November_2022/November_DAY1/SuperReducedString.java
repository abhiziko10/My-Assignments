
//https://www.hackerrank.com/challenges/reduced-string/problem?isFullScreen=true

/*
Reduce a string of lowercase characters in range ascii['a'..'z']by
doing a series of operations. In each operation, select a pair of adjacent
letters that match, and delete them.
Delete as many characters as possible using this method and return the
resulting string. If the final string is empty, return Empty String
Example.
8aab
aab shortens to b in one operation: remove the adjacent a characters.
s = 'abba'
Remove the two 'b' characters leaving 'aa'. Remove the two 'a' characters to
leave". Return 'Empty String.
Function Description
Complete the superReducedString function in the editor below.
superReducedString has the following parameter(s):
string s: a string to reduce
string: the reduced string or Empty String
Input Format
A single string. s.
Constraints
.1 length of s < 100
Sample Input 0
aaabccddd
Sample Output 0
abd
Explanation 0
Perform the following sequence of operations to get the final string:
aaabccddd abccddd abddd abd
Sample Input 1
aa
Sample Output 1
Empty String
Explanation 1
aa Empty String


 */




package November_DAY1;

public class SuperReducedString {
    public static void main(String[] args) {
    ReducedString reducedString=new ReducedString();

        System.out.println(reducedString.superReducedString("aab"));
    }
}
class ReducedString {
    public String superReducedString(String string) {
        StringBuffer stringBuffer = new StringBuffer(string);
              for (int i = 0; i < stringBuffer.length() - 1; i++) {
                  if (stringBuffer.charAt(i) == stringBuffer.charAt(i + 1)) {

                      stringBuffer.delete(i, i + 2);
                  }
              }

        return stringBuffer.toString();

    }
}
