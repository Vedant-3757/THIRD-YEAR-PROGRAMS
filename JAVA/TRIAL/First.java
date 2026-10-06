import java.io.*;
public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
    }
}