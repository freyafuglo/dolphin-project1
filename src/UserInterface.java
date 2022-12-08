import java.io.IOException;
import java.util.Scanner;

public class UserInterface { // EJERSKAB: MATHIAS & CO
    Scanner in = new Scanner(System.in);

    public void println(String msg) {
        System.out.println(msg);
    }

    public String readString() {
        return in.nextLine();
    }

    public String scannerBug() {
        return in.nextLine();
    }

    public String readString(String msg) {
        println(msg);
        return readString();
    }

    public int readInt() {
        int intIn = 0;
        boolean done = false;
        do {
            try {
                intIn = Integer.parseInt(in.next());
                done = true;
            } catch (NumberFormatException e) {
                    System.out.println("Du skal skrive et tal (fx. 23)");
                }
        } while (!done);
        return intIn;
    }

    public int readInt(String msg) {
        println(msg);
        return readInt();
    }

    public double readDouble() {
        double doubleIn = 0;
        boolean done=false;
        do{
            try{
                doubleIn = Double.parseDouble(in. next());
                done=true;
            } catch (NumberFormatException e){
                System.out.println("Skriv et tal (fx. 56.88)");
            }
        } while (!done);
        return doubleIn;
    }

    public double readDouble(String msg) {
        println(msg);
        return readDouble();
    }
}
