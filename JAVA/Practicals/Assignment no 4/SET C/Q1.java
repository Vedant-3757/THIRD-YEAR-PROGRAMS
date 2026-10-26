import java.util.Scanner;
abstract class Operation{
    abstract void calculate(double a,double b);
}
class addition extends Operation{
    void calculate(double a ,double b){
        System.out.println("Addition: "+(a+b));
    }
}
class substraction extends Operation{
    void calculate(double a,double b){
        System.out.println("Substraction: "+(a-b));
    }
}
class multiplication extends Operation{
    void calculate(double a ,double b){
        System.out.println("Multiplication: "+(a*b));
    }
}
class division extends Operation{
    void calculate(double a ,double b){
        System.out.println("Division: "+(a/b));
    }
}
public class Q1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Operation op;
        int choice;
        double a,b;
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        System.out.println("Enter First Num: ");
        a=sc.nextDouble();
        System.out.println("Enter Second Num: ");
        b=sc.nextDouble();
        switch(choice){
            case 1:
                op=new addition();
                op.calculate(a,b);
                break;
            case 2:
                op=new substraction();
                op.calculate(a, b);
                break;
            case 3:
                op=new multiplication();
                op.calculate(a,b);
                break;
            case 4:
                op=new division();
                op.calculate(a,b);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}