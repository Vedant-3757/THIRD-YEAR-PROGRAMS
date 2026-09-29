import java.io.*;
public class primenum {
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int num = Integer.parseInt(br.readLine());
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("It is a prime number");
    }
    
}
