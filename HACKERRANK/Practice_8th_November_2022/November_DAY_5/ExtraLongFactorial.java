//Link:https://www.hackerrank.com/challenges/extra-long-factorials/problem
/*
The factorial of the integer , written . is defined as:
n! = n x (n- 1) x (n-2) x x 3 x 2 x1
Calculate and print the factorial of a given integer.
For example, if n = 30, we calculate 30 x 29 x 28 x x2 x 1 and get 265252859812191058636308480000000.
Function Description
Complete the extraLongFactorials function in the editor below. It should print the result and return.
extraLongFactorials has the following parameter(s):
n:an integer
Note: Factorials of > 20 can't be stored even in a 64 bit long long variable. Big integers must be used for such
calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to
handle huge values.
We recommend solving this challenge using Biglntegers.
Input Format
Input consists of a single integer n
Constraints
1S ng100
Input Format
Input consists of a single integer n
Constraints
1n100
Output Format
Print the factorial of .
Sample Input
25
Sample Output
15511210043330985984000000
Explanation
25! 25 x 24 x 23 x x 3 x 2 x1
 */




package November_DAY_5;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void main(String[] args) {
       ExtraLongFactorial.extraLongFactorials(25);
    }
    static void extraLongFactorials(int number){

        BigInteger bigInteger=new BigInteger("1");
        for (int i=1;i<=number;i++){
           bigInteger=bigInteger.multiply(BigInteger.valueOf(i));

        }
        System.out.println(bigInteger);
    }
}
