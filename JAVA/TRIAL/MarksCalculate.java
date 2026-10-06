import java.io.*;
public class MarksCalculate {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println("Enter your JAVA Marks (Out of 30): ");
        int java = Integer.parseInt(br.readLine());
        System.out.println("Enter your DBMS Marks (Out of 30): ");
        int dbms = Integer.parseInt(br.readLine());
        System.out.println("Enter your OS Marks (Out of 30): ");
        int os = Integer.parseInt(br.readLine());
        System.out.println("Enter your CN Marks (Out of 30): ");
        int cn = Integer.parseInt(br.readLine());
        double total = ( java + dbms + os + cn ) / 120 * 100;
        if(total >= 80){
            System.out.println("Grade: A");
        } else if(total >= 50){
            System.out.println("Grade: B");
        } else if(total >= 35){
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

    }
    }
