
//2 try to add Numeric data in String data type then handle this exception

package DAY_15_CORE_JAVA;

public class Question_2 {
    public static void main(String[] args) {
        String str="Abhishek Banerjee";
        try{
            int number=Integer.parseInt(str);
            System.out.println("The new number will be");
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(("Enter integer value"));
        }
    }
}



/*
java.lang.NumberFormatException: For input string: "Abhishek Banerjee"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:668)
	at java.base/java.lang.Integer.parseInt(Integer.java:784)
	at DAY_15_CORE_JAVA.Question_3.main(Question_3.java:7)
Enter integer value


 */