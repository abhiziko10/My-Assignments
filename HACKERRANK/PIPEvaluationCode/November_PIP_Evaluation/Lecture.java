package November_PIP_Evaluation;

public class Lecture {
    public static void main(String[] args) {
        int arrivalTime[]={12,1,2,3,5,6};
        int hours[]={2,1,1,3,4,3};
         
        int count=1;
        int nextLecture;

        if(arrivalTime[0]==12){
            nextLecture=hours[0];
        }else{
            nextLecture=arrivalTime[0]+hours[0];
        }
        for(int i=1;i<arrivalTime.length;i++) {
            if (arrivalTime[i] >= nextLecture) {
                count++;
                nextLecture = nextLecture + hours[i];
            }
            if(nextLecture>8){
                count--;
            }
        }
        System.out.println("Number of classes conducted are:");
        System.out.println(+count);
        System.out.println("Number of classes that are cancelled are");
        System.out.println((arrivalTime.length)-count);
    }
}

