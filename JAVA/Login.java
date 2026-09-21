/*import java.io.*;
class Login{
    public static void main(String[]args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Admin Login Page");
        System.out.println("Enter Username : ");
        String username=br.readLine();
        System.out.println("Enter Password : ");
        String password=br.readLine();
        if(username.equals("admin") && password.equals("admin123")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed");
        }
    }

}*/
import java.io.*;
class Login{
    static String user="admin";
    static String pass="admin123";
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Admin Login Page");
        System.out.println("Enter Username : ");
        String username = br.readLine();
        System.out.println("Enter Password : ");
        String password = br.readLine();
        if(username.equals(user) && password.equals(pass)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed");
        }
    }

}