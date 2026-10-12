//formula for convert celsius to fahrenheit is (celsius * 9/5) + 32;
public class Q2 {
    public static void main(String[]args){
        double celsius = Double.parseDouble(args[0]);
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degree celsius is equal to " + fahrenheit + " degree fahrenheit.");
    }
}
