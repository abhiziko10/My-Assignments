package DAY_16_CORE_JAVA;
class InvalidAmountException extends Exception {
    InvalidAmountException() {
        super("Invalid input please check your input");
    }
}
    class Question_1{
    int deposit=1000;
    int withdrawl=0;
    int balance=100000;


        public void deposit() {
            try {
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println(balance);
                } else {
                    throw new InvalidAmountException();
                }
            }catch(InvalidAmountException e){
                e.printStackTrace();
            }
        }

        public void withdrawl() {
            try{
                if(withdrawl > 0){
                    balance=balance-withdrawl;
                    System.out.println(balance);
                }
                else{
                    throw new InvalidAmountException();
                }
            }catch(InvalidAmountException e){
                e.printStackTrace();
            }
        }
    }
public class Custom_Exception2 {
    public static void main(String[] args) {
        Question_1 question_1=new Question_1();
        question_1.withdrawl();
        
    }
}



//Output:
/*
DAY_16_CORE_JAVA.InvalidAmountException: Invalid input please check your input
	at DAY_16_CORE_JAVA.Question_1.withdrawl(Custom_Exception2.java:33)
	at DAY_16_CORE_JAVA.Custom_Exception2.main(Custom_Exception2.java:43)

Process finished with exit code 0

 */