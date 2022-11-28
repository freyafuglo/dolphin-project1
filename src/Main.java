public class Main
{

    UserInterface ui = new UserInterface();

    void run(){
        String name;
        name = ui.readString("Enter Name: ");
        ui.println(name);
    }

    public static void main(String[] args)
    {
        new Main().run();
    }
}
