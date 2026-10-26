import java.util.Scanner;
class IllegalNumberOfArgumentException extends Exception{
    IllegalNumberOfArgumentException(String msg){
        super(msg);
    }
}
class InvalidOperaterException extends Exception{
    InvalidOperaterException(String msg){
        super(msg);
    }
}
class NegativeResultException extends Exception{
    NegativeResultException(String msg){
        super(msg);    
    }
}
class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter First Value: ");
            String a=sc.next();
            System.out.println("Enter Second Value: ");
            String b=sc.next();
            System.out.println("( + , - , * , / , % ) Enter Operator: ");
            String op=sc.next();
            if(a.isEmpty() || b.isEmpty() || op.isEmpty()){
                throw new IllegalNumberOfArgumentException("Please Enter Two Values & one Operator");
            }
            else if(!op.matches("['+','-','*','/','%']+")){
                throw new InvalidOperaterException("Enter Valid Operator + || - || * || / || %");
            }
            int n1=Integer.parseInt(a);
            int n2=Integer.parseInt(b);
            char operator=op.charAt(0);
            int result=0;
            switch(operator){
                case '+':
                    result=n1+n2;
                    break;
                case '-':
                    result=n1-n2;
                    break;
                case '*':
                    result=n1*n2;
                    break;
                case '/':
                    if(n2==0){
                        throw new ArithmeticException("Division by zero not allowed");
                    }
                    result=n1/n2;
                    break;
                case '%':
                    if(n2==0){
                        throw new ArithmeticException("Module By Zero Not allowed");
                    }
                    result=n1%n2;
                    break;
            }
            if(result<0){
                throw new NegativeResultException("Result is zero");
            }
            System.out.println("Result: "+result);
        }
        catch(IllegalNumberOfArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidOperaterException e){
            System.out.println(e.getMessage());
        }
        catch(NegativeResultException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}