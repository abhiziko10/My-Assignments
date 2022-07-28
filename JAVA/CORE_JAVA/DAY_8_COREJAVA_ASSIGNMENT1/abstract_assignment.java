package DAY_8_COREJAVA_ASSIGNMENT1;
abstract class vehicle{
    abstract void engine();
}
class car extends vehicle{
    void engine(){
        System.out.println("Car has good engine");
    }
}
class truck extends vehicle{
    void engine(){
        System.out.println("Truck has bad engine");
    }
}
public class abstract_assignment {
    public static void main(String[] args) {
        vehicle v;
         v=new car();
        v.engine();
         v=new truck();
        v.engine();
    }
}
