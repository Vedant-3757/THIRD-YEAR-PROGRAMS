//si=(p*r*t)/100 & ci=p*Math.pow((1+r/100),t)-p
import java.io.*;
public class Q1 {
    public static void main(String[]args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter principal amount:");
        double p=Double.parseDouble(br.readLine());
        System.out.println("Enter rate of interest:");
        double r=Double.parseDouble(br.readLine());
        System.out.println("Enter time in years:");
        double t=Double.parseDouble(br.readLine());
        double si=(p*r*t)/100;
        double ci=p*Math.pow((1+r/100),t)-p;
        System.out.println("Simple Interest: "+si);
        System.out.println("Compound Interest: "+ci);
    }
}
