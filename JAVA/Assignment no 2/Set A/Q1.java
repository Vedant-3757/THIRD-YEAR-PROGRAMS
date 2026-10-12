import java.io.*;
public class Q1 {
    public static void main(String[]main)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Num: ");
        int a=Integer.parseInt(br.readLine());
        if (a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}