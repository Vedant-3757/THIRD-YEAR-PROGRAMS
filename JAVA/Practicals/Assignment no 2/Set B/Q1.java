import java.util.*;
class Q1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i==1){
                System.out.println(i + " not prime Num");
                continue;
            }
            boolean p=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    p=false;
                }
            }
            if(p==false){
                System.out.println(i + " not prime Num");
            }else{
                System.out.println(i +" Prime Num");
            }
        }
        sc.close();
        
            }
        }
        
    