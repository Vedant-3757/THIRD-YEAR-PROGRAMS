import java.util.Scanner;
class VowelException extends Exception{
    VowelException(String msg){
        super(msg);
    }
}
class BlankException extends Exception{
    BlankException(String msg){
        super(msg);
    }
}
class ExitException extends Exception{
    ExitException(String msg){
        super(msg);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter an Character: ");
            char ch=sc.next().charAt(0);
            if(ch==' '){
                throw new BlankException("cant be blank");
            }else if("AEIOUaeiou".indexOf(ch)!=-1){
                throw new VowelException("Vowel not allowed");
            }else if(ch=='X'||ch=='x'){
                throw new ExitException("Exited Due to invalid char");
            }else{
                System.out.println("Valid Char");
            }
        }
        catch(BlankException e){
            System.out.println(e.getMessage());
        }
        catch(VowelException e){
            System.out.println(e.getMessage());
        }
        catch(ExitException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
