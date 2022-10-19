/*
You are choreographing a circus show with various animals. For one act. you are given two
kangaroos on a number line ready to jump in the positive direction (i.e, toward positive
infinity)
The first kangaroo starts at location æl and moves at a rate of vl meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time
as part of the show. Ifit is possible, return YES, otherwise return NO.
Example
l = 2
vl = 1
2=1
v2=2
After one jump, they are both at z = 3. (1+ vl =2+1. a2+v2 = 1 +2), so the
answer is YES.
Function Description
Complete the function kangaroo in the editor below.
kangaroo has the following parameter(s):
int x1, int v1: starting position and jump distance for kangaroo 1


 */







package October_DAY17;

public class NumberLineJumps {
    public static void main(String[] args) {
        System.out.println( NumberLineJumps.kangaroo(0,3,4,2));
    }
    public static String kangaroo(int x1, int v1, int x2, int v2){
        if(x1==x2){
            return "YES";
        }
        int difference=v1>v2?v1-v2:v2-v1;
        if(difference==0){
            return "NO";
        }
        int xDifference=x1-x2;
        int vDifference=v2-v1;
        if((xDifference<0 && vDifference<0)||(xDifference>0 && vDifference>0)){
            int mod1=xDifference%vDifference;
            int mod2=vDifference %xDifference;
            if(mod1==0||mod2==0){
                return "YES";
            }

        }
        return "NO";
    }
}
