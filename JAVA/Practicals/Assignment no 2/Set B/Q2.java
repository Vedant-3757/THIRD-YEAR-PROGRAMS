import java.util.Scanner;
class Q2{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a num: ");
    long a=sc.nextInt();
    long firstterm=0;
    long secondterm=1;
    for(int i=1;i<=a;i++){
        System.out.println(firstterm + " ");
        long nextterm=firstterm + secondterm;
        firstterm=secondterm;
        secondterm=nextterm;
    }
    sc.close();
    }
}