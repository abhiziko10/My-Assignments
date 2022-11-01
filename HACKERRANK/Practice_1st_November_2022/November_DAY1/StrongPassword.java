//Link:https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true
/*
Louise joined a social networking site to stay in touch with her friends. The
signup page required her to input a name and a password. However, the
password must be strong. The website considers a password to be strong
if it satisfies the following criteria:
Its length is at least 6.
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are:
# $96 & () -+
She typeda random string of length n in the password field but wasn't
sure if it was strong. Given the string she typed, can you find the minimum
number of characters she must add to make her password strong?
Note: Here's the set of types of characters in a form you can paste in your
solution:

numbers "0123456789 "
lower_case "abcdefghijklmnopqrstuvwxyz"
upper_case "ABCDEFGHIJKLMNOPQRSTUVwxYz"
special_characters = ":@#$9%n&* ()-+"
Example
password = '2bbbb
This password is 5 characters long and is missing an uppercase and a
special character. The minimum number of characters to add is 2.
password = '2bb#A
This password is 5 characters long and has at least one of each character
type. The minimum number of characters to add is 1.
Function Description

Complete the minimumNumber function in the editor below.
minimumNumber has the following parameters:
int n: the length of the password
string password: the password to test
Returns
int: the minimum number of characters to add
Input Format
The first line contains an integer n, the length of the password.
The second line contains the password string. Each character is either a
lowercase/uppercase English alphabet, a digit, or a special character.
Constraints
1n 100
All characters in password are in [a-z]. [A-Z]. [0-9], or [!@#$%^&*(-+].
 */

package November_DAY1;



public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(Password.minimumNumber(3,"Ab1"));
    }
}
class Password{
    public static int minimumNumber(int n, String password){
        int totalChar = password.length();
        int upperCase = 0,count=0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else {
                others++;
            }
        }
        if(upperCase==0)
            count++;
        if(lowerCase==0)
            count++;
        if(digits==0)
            count++;
        if(others==0)
            count++;
        if(count+n<6)
        {
            return 6-n;
        }
        return count;
    }

}

