//Link:https://www.hackerrank.com/challenges/caesar-cipher-1/problem?isFullScreen=true


/*
Julius Caesar protected his confidential information by encrypting it using a
cipher. Caesar's cipher shifts each letter by a number of letters. If the shift
takes you past the end of the alphabet, just rotate back to the front of the
alphabet. In the case of a rotation by 3, W, x, y and z would map to z, a, b
and c.
Original alphabet:
abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:
defghijklmnopqrstuvwxyzabc
Example
s= There's-a-starman-waiting-in-the-sky
k=3
The alphabet is rotated by 3. matching the mapping above. The encrypted
string is Wkhuh'v-d-vwdupdq-zdlwlqj-lq-wkh-vnb.
Note: The cipher only encrypts letters; symbols, such as - remain
unencrypted.
Function Description
Complete the caesarCipher function in the editor below.
caesarCipher has the following parameter(s):
string s: cleartext
int k: the alphabet rotation factor
Returns
string: the encrypted string
Input Format
The first line contains the integer. n., the length of the unencrypted string.
The second line contains the unencrypted string, s.
The third line contains k. the number of letters to rotate the alphabet by.
Constraints
1n<100
0kg 100
s is a valid ASCII string without any spaces.

11
middle-0utz
2
Sample Output
okffng-Qwvb
Explanation
Original alphabet:
abcdefghijklmnopqrstuvwxyz
Alphabet rotated +2:
cdefghijklmnopqrstuvwxyzab
m
i->k
d -> f
d -> f
1-n
e -8


 */







package November_DAY1;

public class CaesarCipher {
    public static void main(String[] args) {
  CaesarProblem caesarProblem=new CaesarProblem();
        System.out.println(caesarProblem.caesarCipher("abcde-fghijklmnopqrstuvwxyz",3));
    }
}
class CaesarProblem {
    public static String caesarCipher(String s, int k) {

        String CipherText = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char c = (char) (ch + k);
                    if (c > 'Z') {
                        CipherText += (char) (ch - (26 - k));


                    } else {
                        CipherText += c;
                    }
                }

                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + k);
                    if (c > 'z') {
                        CipherText += (char) (ch - (26 - k));


                    } else {
                        CipherText += c;
                    }
                }
            }else{
                CipherText+=ch;
            }
        }

        return CipherText;
    }
}
