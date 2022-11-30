import java.util.Scanner;

public class UserInterface { // EJERSKAB: ALLE

    Scanner in = new Scanner(System.in);

    public void print(String msg){
        System.out.print(msg);
    }

    public void println(String msg){
        System.out.println(msg);
    }

    public String readString(){
        return in.nextLine();
    }

    public String readString(String msg){
        println(msg);
        return readString();
    }

    public int readInt(){
        return in.nextInt();
    }

    public int readInt(String msg){
        println(msg);
        return readInt();
    }
}
