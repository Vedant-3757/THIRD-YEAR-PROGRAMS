
interface playable{
    void play();
}
class football implements playable{
    public void play(){
        System.out.println("Playing Football");
    }
}
class volleyball{
    public void play(){
        System.out.println("Playing Volleyball");
    }
}
class basketball{
    public void play(){
        System.out.println("Playing Basketball");
    }
}
public class Q3{
    public static void main(String[] args) {
        football f=new football();
        volleyball v=new volleyball();
        basketball b=new basketball();
        f.play();
        v.play();
        b.play();
    }
}