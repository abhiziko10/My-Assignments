package DAY_6_CORE_JAVA;
class Bank{
    private long Account_num;
    private String iifsc_code;
    private double Balance;
    private String username;
    private String password;

    public long getAccount_num(){
        return Account_num;
    }
    public void setAccount_num(long Account_num){
        this.Account_num=Account_num;
    }
    public String getIifsc_code(){
        return iifsc_code;
    }
    public void setIifsc_code(String iifsc_code){
        this.iifsc_code=iifsc_code;
    }
    public double getBalance(){
        return Balance;
    }
    public void setBalance(double balance){
        this.Balance=Balance;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
}

public class Bank_Details {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.setAccount_num(14567890);
        b.setIifsc_code("SBIN1000");
        b.setBalance(25000.00);
        b.setUsername("abhishek.banerjee");
        b.setPassword("qwerty123@#");
        System.out.println("The username is: "+b.getUsername());
        System.out.println("***********************************");
        System.out.println("The password is: "+b.getPassword());
        System.out.println("***********************************");
        System.out.println("The Account number is: "+b.getAccount_num());
        System.out.println("***********************************");
        System.out.println("The IIFSC CODE is: "+b.getIifsc_code());
        System.out.println("***********************************");
        System.out.println("The Account balance is "+b.getBalance());


    }
}

//THE OUTPUT IS :
//C:\Users\coditas\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\lib\idea_rt.jar=53043:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.3\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\coditas\IdeaProjects\CORE JAVA_DAY 2\out\production\CORE JAVA_DAY 2" DAY_6_CORE_JAVA.Bank_Details
//The username is: abhishek.banerjee
//***********************************
//The password is: qwerty123@#
//***********************************
//The Account number is: 14567890
//***********************************
//The IIFSC CODE is: SBIN1000
//***********************************
//The Account balance is 0.0
//
//Process finished with exit code 0