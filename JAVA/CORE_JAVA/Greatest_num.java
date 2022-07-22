package DAY_4_CORE_JAVA;
import java.util.*;
public class Greatest_num {
    public void g_number(){
        int num1=0,num2=0;
        if(num1>num2)
            System.out.println("num1 is the greatest number");
            else
            System.out.println("num2 is the greatest number");



    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Greatest_num obj=new Greatest_num();
        obj.g_number();
    }
}
