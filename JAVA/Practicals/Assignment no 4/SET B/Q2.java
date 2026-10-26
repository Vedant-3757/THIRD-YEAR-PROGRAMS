interface IntOperations
{
    boolean isPositive();
    boolean isNegative();
    boolean isEven();
    boolean isOdd();
    boolean isPrime();
    long factorial();
    int sumOfDigits();
}
class MyNumber implements IntOperations
{
    private int num;
      MyNumber()
    {
        this.num = 0;
    }
        MyNumber(int num)
    {
        this.num = num;
    }
    public boolean isPositive()
    {
        return num > 0;
    }
    public boolean isNegative()
    {
        return num < 0;
    }
    public boolean isEven()
    {
        return num % 2 == 0;
    }
    public boolean isOdd()
    {
        return num % 2 != 0;
    }
    public boolean isPrime()
    {
        if(num < 2)
            return false;
        for(int i = 2; i <= num / i; i++)
        {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public long factorial()
    {
        if(num < 0 || num > 20)
            return -1;
        long fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public int sumOfDigits()
    {
        int n = Math.abs(num);
        int sum = 0;
        while(n > 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
}
class Q2
{
    public static void main(String args[])
    {
        if(args.length == 0)
        {
            System.out.println("Please pass an integer as command line argument.");
            return;
        }
        int n = Integer.parseInt(args[0]);
        MyNumber obj = new MyNumber(n);

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Check Positive");
            System.out.println("2. Check Negative");
            System.out.println("3. Check Even");
            System.out.println("4. Check Odd");
            System.out.println("5. Check Prime");
            System.out.println("6. Find Factorial");
            System.out.println("7. Sum of Digits");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println(obj.isPositive()
                        ? "Number is Positive"
                        : "Number is not Positive");
                    break;

                case 2:
                    System.out.println(obj.isNegative()
                        ? "Number is Negative"
                        : "Number is not Negative");
                    break;

                case 3:
                    System.out.println(obj.isEven()
                        ? "Number is Even"
                        : "Number is not Even");
                    break;

                case 4:
                    System.out.println(obj.isOdd()
                        ? "Number is Odd"
                        : "Number is not Odd");
                    break;

                case 5:
                    System.out.println(obj.isPrime()
                        ? "Number is Prime"
                        : "Number is not Prime");
                    break;

                case 6:
                    long f = obj.factorial();

                    if(f == -1)
                        System.out.println("Factorial is not supported for this number.");
                    else
                        System.out.println("Factorial = " + f);
                    break;

                case 7:
                    System.out.println("Sum of Digits = " + obj.sumOfDigits());
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while(choice != 8);
        sc.close();
    }
}