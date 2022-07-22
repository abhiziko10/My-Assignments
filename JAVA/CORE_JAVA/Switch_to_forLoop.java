package DAY_4_CORE_JAVA;

public class Switch_to_forLoop {
    public void for_loop(){
        int m=1,x=1;
        if(m == 0) {
            x = x + 2;
            System.out.println("X=" + x);
        }
            if(m == 1){
                x = x + 4;
                System.out.println("X=" +x);
            }
            if(m == 2){
                x = x + 6;
                System.out.println("X=" +x);
            }


    }
    public static void main(String args[]){
        Switch_to_forLoop sl=new Switch_to_forLoop();
        sl.for_loop();
    }

}

