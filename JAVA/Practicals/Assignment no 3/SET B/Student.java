public class Student {
    int rollno;
    String name;
    float percentage;
    static int count=0;
    Student(){
        rollno=0;
        name="unknown";
        percentage=0;
        count++;
    }
    Student(int r,String n,float p){
        rollno=r;
        name=n;
        percentage=p;
        count++;
    }
    public String toString(){
        return rollno+" "+name+" "+percentage;
    }
    static void displaycount(){
        System.out.println("Object Count: "+count);
    }
    public static void main(String[]args){
        Student s1=new Student(1,"Kunal",85.32f);
        displaycount();
        System.out.println(s1);

        Student s2=new Student(2,"Datta",85.5f);
        displaycount();
        System.out.println(s2);

    }
}
