class vehicle{
    void drive(){
        System.out.println("Driving a Vehicle");
    }
}
class car extends vehicle {
    @Override 
    void drive(){
        System.out.println("Driving a Car");
    }
}
public class Q1{
    public static void main(String[] args) {
        car c=new car();
        c.drive();
    }
}