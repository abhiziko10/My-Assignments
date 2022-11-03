//Link:https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true

/*
Letters in some of the Sos messages are altered by cosmic radiation
during transmission. Given the signal received by Earth as a string, s.
determine how many letters of the sos message have been changed by
radiation.
Example
s 'SOSTOT'
The original message was sossos. Two of the message's characters were
changed in transit.
Function Description
Complete the marsExploration function in the editor below.
marsExploration has the following parameter(s)
string s: the string as received on Earth
Returns
int: the number of letters changed during transmission
Input Format
There is one line of input: a single string, s.
Constraints
1 length of s 99
length of s modulo 3 = 0
s will contain only uppercase English letters, ascil[A-Z]
Sample Input 0
sosSPSSQssOR
Sample Output 0
3
Explanation 0
s SOSSPSsQssOR, and signal length |s = 12. They sent 4 sos messages
(i.e.: 12/3 =4).
Expected signal: ossossossOS
Recieved signal: SOSSPSsQSsOR
Difference :
XX
X


 */





package November_DAY_3;

public class MarsExploration {

    public static void main(String[] args) {
        System.out.println(MarsExploration.marsExploration("SOSSPSSQSSOR"));
    }
    public static int marsExploration(String message){
        int count=0;
        for(int i=0;i<message.length();i=i+3){
            if(message.charAt(i)!='S'){
                count++;
            }if(message.charAt(i+1)!='O'){
                count++;
            }
            if(message.charAt(i+2)!='S'){
                count++;
            }
        }
        return count;

    }
}
