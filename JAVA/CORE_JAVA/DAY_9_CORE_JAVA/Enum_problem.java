package DAY_9_CORE_JAVA;

enum Signals{
    Red("Stop"),
    Green("GO"),
    Yellow("Drive very slow");

String data;
    Signals(String Action) {
        this.data=Action;

    }
    public String getData(){
        return data;
    }
}
public class Enum_problem {
    void show()
    {
        for (Signals sig: Signals.values())
            System.out.println(sig.getData());
    }
    public static void main(String[] args) {
      Enum_problem enum_problem=new Enum_problem();
      enum_problem.show();

    }

}


//THE OUTPUT IS:
/*
C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=52950:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_9_CORE_JAVA.Enum_problem
Stop
GO
Drive very slow

Process finished with exit code 0

 */
