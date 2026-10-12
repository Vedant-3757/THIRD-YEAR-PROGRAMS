//ask user how many  numbers he wants to enter and print
import java.io.*;
public class Q3 {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many numbers do you want to enter?");
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            System.out.println("Enter number "+i+":");
            int num=Integer.parseInt(br.readLine());
            System.out.println("You entered: "+num);
        }
    }
}
