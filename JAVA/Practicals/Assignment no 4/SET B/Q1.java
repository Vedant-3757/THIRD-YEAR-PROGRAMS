import java.util.Scanner;
interface shape{
    double area();
}
class rectangle implements shape{
    double length,breadth; 
    rectangle(double l,double b){
        length=l;
        breadth=b;
    }   
    public double area(){
        return length*breadth;
    }
}
class circle implements shape{
    double radius;
    circle(double r){
        radius=r;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class triangle implements shape{
    double base,height;
    triangle(double b,double h){
        base=b;
        height=h;
    }
    public double area(){
        return 0.5*base*height;
    }
}
public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shape s;
        System.out.println("1.Area of Recatngle");
        System.out.println("2.Area of Circle");
        System.out.println("3.Area of Recctangle");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Length: ");
                double l=sc.nextDouble();
                System.out.println("Enter breadth: ");
                double b=sc.nextDouble();
                s=new rectangle(l,b);
                System.out.println(s.area());
                break;
            case 2:
                System.out.println("Enter Radius: ");
                double rad=sc.nextDouble();
                s=new circle(rad);
                System.out.println(s.area());
                break;
            case 3:
                System.out.println("Enter Base: ");
                double base=sc.nextDouble();
                System.out.println("Enter Height: ");
                double height=sc.nextDouble();
                s=new triangle(base, height);
                System.out.println(s.area());
        }
        sc.close();
    }
}