class InvalidAgeForVoting extends Exception{
    InvalidAgeForVoting(String message){
        super(message);
    }
}
class NameNotValidException extends Exception{
    NameNotValidException(String message){
        super(message);
    }
}
class Q2{
    int voterid;
    String name;
    int age;
    Q2(int voterid,String name,int age) throws InvalidAgeForVoting,NameNotValidException{
        if(age<18){
            throw new InvalidAgeForVoting(
                "Age not Allowed"
            );
        }
        if(!name.matches("[a-zA-Z]+")){
            throw new NameNotValidException(
                "Enter a valid name"
            );
        }
        this.voterid=voterid;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("ID: "+voterid);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        try{
            Q2 a=new Q2(115,"Vedant",20);
            a.display();
        }
        catch(InvalidAgeForVoting e){
            System.out.println(e.getMessage());
        }
        catch(NameNotValidException e){
            System.out.println(e.getMessage());
        }
    }
}