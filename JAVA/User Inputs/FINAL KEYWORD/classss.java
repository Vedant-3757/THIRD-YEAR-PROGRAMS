final class parent{
    void display(){
        System.out.println("This is a final class.");
    }
}
// class child extends parent{ // This line will cause a compilation error because 'parent' is declared as final and cannot be subclassed.
//     void display(){
//         System.out.println("Trying to override the final class.");
//     }
// }
public class classss {
    public static void main(String[] args){
        parent obj = new parent();
        obj.display();
    }
}
