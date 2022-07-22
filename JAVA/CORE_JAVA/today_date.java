package DAY_4_CORE_JAVA;

public class today_date {
    public void date(){
        for(int i=1;i<=22;i++){
            System.out.println(i);
            if(i==22){
                System.out.println("Todays's Date " +i);
                break;
            }
        }

    }
    public static void main(String args[]){
        today_date dt=new today_date();
        dt.date();
    }
}


//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=49939:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_4_CORE_JAVA.today_date
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//15
//16
//17
//18
//19
//20
//21
//22
//Todays's Date 22