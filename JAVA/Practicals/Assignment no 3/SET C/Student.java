import java.util.Scanner;
import SY.SYMarks;
import TY.TYMarks;

class Student
{
    int rollNumber;
    String name;
    SYMarks sy;
    TYMarks ty;

    Student(int r, String n, SYMarks s, TYMarks t)
    {
        rollNumber = r;
        name = n;
        sy = s;
        ty = t;
    }

    void display()
    {
        int total = sy.ComputerTotal + ty.Theory + ty.Practicals;

        System.out.println("\nRoll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Computer Total: " + total);

        if(total >= 70)
            System.out.println("Grade: A");
        else if(total >= 60)
            System.out.println("Grade: B");
        else if(total >= 50)
            System.out.println("Grade: C");
        else if(total >= 40)
            System.out.println("Grade: Pass Class");
        else
            System.out.println("Grade: FAIL");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student s[] = new Student[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("\nEnter roll number: ");
            int r = sc.nextInt();

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter SY Computer marks: ");
            int c = sc.nextInt();

            System.out.print("Enter SY Maths marks: ");
            int m = sc.nextInt();

            System.out.print("Enter SY Electronics marks: ");
            int e = sc.nextInt();

            System.out.print("Enter TY Theory marks: ");
            int t = sc.nextInt();

            System.out.print("Enter TY Practical marks: ");
            int p = sc.nextInt();

            SYMarks sy = new SYMarks(c, m, e);
            TYMarks ty = new TYMarks(t, p);

            s[i] = new Student(r, name, sy, ty);
        }

        System.out.println("\n----- STUDENT RESULT -----");

        for(int i = 0; i < n; i++)
        {
            s[i].display();
        }

        sc.close();
    }
}