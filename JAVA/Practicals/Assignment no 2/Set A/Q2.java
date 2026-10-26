import java.io.*;
class Q2{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Num: ");
        int a=Integer.parseInt(br.readLine());
        int rev=0;
        int temp = a;
        int ldigit;
        while(a>0){
            ldigit = a%10;
            rev = rev*10 + ldigit;
            a = a/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}