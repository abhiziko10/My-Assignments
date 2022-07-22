package DAY_4_CORE_JAVA;

public class switchCase {
    int var=1;
    public void forLoop_to_switchCase(){
        switch(var){
            case 1:
                System.out.println("low");
                break;

            case 2:
                System.out.println("Medium");
                break;

            case 3:
                System.out.println("High");
                break;


            default:
                    System.out.println("abnormal");
        }
    }
    public static void main(String[]args){
        switchCase s=new switchCase();
        s.forLoop_to_switchCase();
    }
}
