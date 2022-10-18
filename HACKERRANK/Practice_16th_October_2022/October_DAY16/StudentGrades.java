package October_DAY16;//Link:https://www.hackerrank.com/challenges/grading/problem?isFullScreen=true
/*HackerLand University has the following grading policy:
        Every student receives a grade in the inclusive range from 0 to 100.
        Any grade less than 40 is a failing grade.
        Sam is a professor at the university and likes to round each student's
        grade according to these rules:
        If the difference between the grade and the next multiple of 5 is less
        than 3, round grade up to the next multiple of 5.
        If the value of grade is less than 38, no rounding occurs as the result
        will still be a failing grade.
        Examples
        grade = 84 round to 85 (85-84 is less than 3)
        grade = 29 do not round (result is less than 40)
        grade = 57 do not round (60 -57 is 3 or higher)
        Given the initial value of grade for each of Sam's m students, write code te
        automate the rounding process.
        Function Description
Complete the function gradingStudents in the editor below.
gradingStudents has the following parameter(s):
int grades[n]: the grades before rounding
Returns
inttn]: the grades after rounding as appropriate
Input Format
The first line contains a single integer, , the number of students.
Each line i of the n subsequent lines contains a single integer, grades[i].
Constraints
1n 60
0 grades|i] 100
 */


import java.util.ArrayList;
import java.util.List;

public class StudentGrades {
    public static void main(String[] args) {
    List<Integer>list=new ArrayList<>();
    list.add(33);
    list.add(44);
    list.add(55);
        System.out.println(StudentGrades.gradingStudents(list));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

      for(int i=0;i<grades.size();i++){
          if(grades.get(i)>=38){
              int q=grades.get(i)/5;
              int r= grades.get(i)%5;
              if(r>=3){
                  grades.set(i,(q+1)*5);

              }
          }
      }
      return grades;
    }
}
