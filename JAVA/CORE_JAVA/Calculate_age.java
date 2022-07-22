package DAY_4_CORE_JAVA;
import java.util.*;

public class Calculate_age {
    void age_operation() {
        int age1, age2, age3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of each person : ");
        age1 = sc.nextInt();
        age2 = sc.nextInt();
        age3 = sc.nextInt();
        if( age1 > age2 && age1 > age3 ) {
            System.out.println("Oldest age is : " + age1);
            if( age2 > age3)
                System.out.println("Youngest age is : "+age3);
            else
                System.out.println("Youngest age is : "+age2);
        }
        else if ( age2 > age1 && age2 > age3 ) {
            System.out.println("Oldest age is : " + age2);
            if( age1 > age3)
                System.out.println("Youngest age is : "+age3);
            else
                System.out.println("Youngest age is : "+age1);
        }
        else if ( age3 > age1 && age3 > age2 ) {
            System.out.println("Oldest age is : " + age3);
            if( age1 > age2)
                System.out.println("Youngest age is : "+age2);
            else
                System.out.println("Youngest age is : "+age1);
        }
    }



    public static void main(String[] args) {
        Calculate_age age_object = new Calculate_age();
        age_object.age_operation();
    }
}


//OUTPUT IS:
//Enter the age of each person :
//45
//55
//65
//Oldest age is : 65
//Youngest age is : 45
//
//Process finished with exit code 0