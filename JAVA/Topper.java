import java.io.*;
public class Topper{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name=br.readLine();
        System.out.println("Enter Roll No: ");
        int roll=Integer.parseInt(br.readLine());
        System.out.println("Enter Total Marks: ");
        int total=Integer.parseInt(br.readLine());
        System.out.println("Name of the Student : "+name);
        System.out.println("Roll No of Student is : "+roll);
        System.out.println("Total Marks of Student is : "+total);
    }
}
