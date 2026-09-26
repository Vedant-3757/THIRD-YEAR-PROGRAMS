class antropic{
    final void display(){
        System.out.println("This is a final method.");
    }
}
class claude extends antropic{
    //void display(){ // This line will cause a compilation error because 'display()' is declared as final in the superclass and cannot be overridden.
    //    System.out.println("Trying to override the final method.");
    //}
}
class main{
    public static void main(String[] args){
        claude obj = new claude();
        obj.display();
    }
}