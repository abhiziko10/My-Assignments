package DAY_15_CORE_JAVA;

public class Question_3 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[10];

            int sum = 0;
            //good code
            for (int i = 0; i < 10; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
            for (int i = 0; i < 11; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Wrong length of array");
        }
    }
}




/*
0
Wrong length of array
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
	at DAY_15_CORE_JAVA.Question_3.main(Question_3.java:15)

Process finished with exit code 0
 */