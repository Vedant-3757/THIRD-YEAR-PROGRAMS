import java.util.Scanner;
class Student
{
    int rollno;
    String name;
    double percentage;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Percentage: ");
        percentage = sc.nextDouble();}
    void display(){
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage + "%");}
    public static void main(String args[]){
        Student s[] = new Student[5];
        for(int i = 0; i < 5; i++)
        {
            s[i] = new Student();
            System.out.println("\nEnter details of Student " + (i + 1));
            s[i].accept();
        }
        System.out.println("\nStudent Information");
        for(int i = 0; i < 5; i++)
        {
            s[i].display();
        }
        
    }
}