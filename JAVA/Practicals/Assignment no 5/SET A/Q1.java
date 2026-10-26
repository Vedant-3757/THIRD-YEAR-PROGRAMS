class AgeNotWithinRangeException extends Exception{
    AgeNotWithinRangeException(String message){
        super(message);
    }
}
class NameNotValidException extends Exception{
    NameNotValidException(String message){
        super(message);
    }
}
class Q1{
    int rollno;
    String name;
    int age;
    String course;
    Q1(int rollno,String name,int age,String course) throws AgeNotWithinRangeException,NameNotValidException{
        if(age<15||age>21){
            throw new AgeNotWithinRangeException(
                "Age must be between 15 to 21 years");
        }
        if(!name.matches("[a-zA-Z]+")){
            throw new NameNotValidException(
                "Name must contain Alphabets & Spaces"
            );
        }
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    void display(){
            System.out.println("Roll No: "+rollno);
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Course: "+course);
        }
    public static void main(String args[]){
        try{
            Q1 s=new Q1(101,"Vedant",21,"BSC IT");
            s.display();
        }
        catch(AgeNotWithinRangeException e){
            System.out.println(e.getMessage());
        }
        catch(NameNotValidException e){
            System.out.println(e.getMessage());
        }
    }
}