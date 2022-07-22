package DAY_4_CORE_JAVA;

public class WeekDays {
public void week(){
    for(int i=1;i<=7;i++){
        if(i == 1){
            System.out.println("MOnday");
        }
        if(i == 2){
            System.out.println("Tuseday");
        }
        if(i == 3){
            System.out.println("Wednesday");
        }
        if(i == 4){
            System.out.println("Thursday");
        }
        if(i == 5){
            System.out.println("Friday");
        }
        if(i == 6){
            System.out.println("Saturday");
        }
        if(i == 7){
            System.out.println("Sunday");
        }
    }
}
public static void main(String args[]){
    WeekDays wk=new WeekDays();
    wk.week();
}
}

//OUTPUT:

//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=49862:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_4_CORE_JAVA.WeekDays
//MOnday
//Tuseday
//Wednesday
//Thursday
//Friday
//Saturday
//Sunday