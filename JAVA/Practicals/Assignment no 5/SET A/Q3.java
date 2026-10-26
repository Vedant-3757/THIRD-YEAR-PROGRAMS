import java.io.*;
class Q3{
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("C:\\Users\\vedan\\OneDrive\\Desktop\\source.txt");
            FileWriter fw=new FileWriter("C:\\Users\\vedan\\OneDrive\\Desktop\\destination.txt");
            int ch;
            while((ch=fr.read())!=-1){
                char c =(char)ch;
                if(Character.isUpperCase(c)){
                    c=Character.toUpperCase(c);
                }
                else if(Character.isLowerCase(c)){
                    c=Character.toUpperCase(c);
                }
                else if(Character.isDigit(c)){
                    c='*';
                }
                fw.write(c);
            }
            fr.close();
            fw.close();
            System.out.println("File Copied Successfully!!");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}