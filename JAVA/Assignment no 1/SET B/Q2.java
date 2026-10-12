import java.io.*;
public class Q2 {
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the purchse amount");
        double amt=Double.parseDouble(br.readLine());
        System.out.println("Enter selling price: ");
        double sell=Double.parseDouble(br.readLine());
        double profit=sell-amt;
        System.out.println("Profit is: "+profit);
    }
    
}
