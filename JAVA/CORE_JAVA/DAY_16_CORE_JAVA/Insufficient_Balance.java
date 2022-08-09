package DAY_16_CORE_JAVA;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        super("Insufficient Balance in your account");
    }
}
class Balance{
    int balance=1000;
    public void withdrawl(int amount){
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException();
            }
            else{
                balance=balance-amount;
                System.out.println("Available balance"+balance);
            }

            }catch(InsufficientBalanceException e){
            e.printStackTrace();
        }
    }
}
public class Insufficient_Balance {

    public static void main(String[] args) {
        Balance balance=new Balance();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount for withdrawl");
        int amount =sc.nextInt();
        balance.withdrawl(amount);
    }
}



//Output
/*Enter amount for withdrawl
10000
DAY_16_CORE_JAVA.InsufficientBalanceException: Insufficient Balance in your account
	at DAY_16_CORE_JAVA.Balance.withdrawl(Insufficient_Balance.java:15)
	at DAY_16_CORE_JAVA.Insufficient_Balance.main(Insufficient_Balance.java:34)

Process finished with exit code 0

 */
//Output 2:
/*
Enter amount for withdrawl
100
Available balance900

Process finished with exit code 0

 */