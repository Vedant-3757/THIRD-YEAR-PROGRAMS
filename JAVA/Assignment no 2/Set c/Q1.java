import java.util.Scanner;
class Q1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Num: ");
        int a=sc.nextInt();
        System.out.println("Enter Second Num: ");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Which operation( + , - , * , / ):");
        String c=sc.nextLine();
        switch(c){
            case "+":
                System.out.println("Addition: "+(a+b));
                break;
            case "-":
                System.out.println("Substraction: "+(a-b));
                break;
            case "*":
                System.out.println("Multipliccation: "+(a*b));
                break;
            case "/":
                System.out.println("Division: "+(a/b));
            }
            sc.close();
        }
    }
