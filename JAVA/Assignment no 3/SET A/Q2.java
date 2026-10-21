import java.util.Scanner;
class emp{
    String name;
    int salary;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        name=sc.nextLine();
        System.out.println("Enter Salary: ");
        salary=sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("NAME: "+name);
        System.out.println("SALARY: "+salary);
    }
}
public class Q2 {
    public static void main(String[]args){
        emp e=new emp();
        e.accept();
        e.display();
    }
}
