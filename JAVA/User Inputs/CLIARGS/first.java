
// public class first {
//     public static void main(String[] args) {
//        System.out.println("<---Total Args--->");
//        System.out.println("Length of args array: " + args.length);
//        System.out.println("Each of Them are : ");
//        for(int k =0;k<args.length;k++){
//            System.out.println("args[ "+k+" ] "+args[k]);
//        }
//     }
// }

// public class first{
//     public static void main(String[]args){
//         System.out.println( "<---Total Args--->");
//         System.out.println("Length of args array: "+args.length);
//         for(int i = 0;i<args.length;i++){
//             System.out.println("args["+i+"]"+args[i]);

//         }
//     }
// }


//greater-smaller number
public class first{
    public static void main(String[]args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(b>a){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println("Both are equal");
        }

    }
}
