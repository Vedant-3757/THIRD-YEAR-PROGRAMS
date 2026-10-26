class animal{
    void move(){
        System.out.println("Animal RUNS");
    }
}
class cheetah extends animal{
    void move(){
        System.out.println("Cheetah runs very fast");
    }
}
public class Q2 {
    public static void main(String[] args) {
        cheetah c =new cheetah();
        c.move();
    }
}
