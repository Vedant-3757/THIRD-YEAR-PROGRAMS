import java.util.Scanner;
class math{
    int a,b;
    void addition(){
        System.out.println("Addition: "+(a+b));
    }
    void substraction(){
        System.out.println("Substraction: "+(a-b));
    }
    void multiplication(){
        System.out.println("Multiplication: "+(a*b));
    }
    void division(){
        if(b!=0)
            {System.out.println("Division: "+(a/b));}
    }
}
public class Q1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        math m=new math();
        System.out.println("Enter First Num: ");
        m.a=Integer.parseInt(sc.nextLine());
        System.out.println("Enter Second Num: ");
        m.b=Integer.parseInt(sc.nextLine());
        m.addition();
        m.substraction();
        m.multiplication();
        m.division();
        sc.close();
    }
}