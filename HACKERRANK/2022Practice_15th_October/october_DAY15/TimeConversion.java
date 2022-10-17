//Link:https://www.hackerrank.com/challenges/time-conversion/problem

/*
Gven a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note:-12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
12:00:00PM on a 12-hour clock is 12:00:00 ona 24-hour clock.
Example
S=12:01:00PMf
Return '12:01:00'.
s = '12:01:00AM
Return 00:013 1:00.
Function Description
Complete the timeconversion function in the editor below. It should returna new string representing the input time in 24 hour
format.
timeconversion has the following parameter(s):
string S: a time in 12 hour format
Returns
string: the time in 24 hour format
Input Format
A single string s that represents a time in 12-.hour dlock format (i.e.: hh:mm:ssAM or hh:mm:ssPM).
 */




package october_DAY15;

public class TimeConversion {
    public static void main(String[] args) {
        String string = "01:40:22AM";
        System.out.println(TimeConversion.timeConversion(string));
    }

    public static String timeConversion(String s) {
        // Write your code here

        String string = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));
        if (string.equals("AM")) {
            if (hour == 12) {
                hour = 0;
            }
        }
        if (string.equals("PM")) {
            if (hour != 12) {
                hour += 12;
            }

        }
      return String.format("%02d%s", hour, s.substring(2, 8));

    }
}

