import java.util.Scanner;
class multiplicationtable{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println( "Enter Num to print multiplication table : ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num + " x "+ i + " = " + num*i);
        }
        sc.close();
    }
}
