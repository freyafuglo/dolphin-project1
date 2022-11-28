public class Main
{

    UserInterface ui = new UserInterface();

    Menu menu = new Menu("HOVEDMENU", "Vælg menupunkt: ", new String[]{
            "1. Tilføj nyt medlem",
            "2. Rediger medlem",
            "3. Medlemsliste",
            "4. Top 5",
            "5. Rediger medlem",
            "6. Regnskab",
            "7. Holdliste",
            "8. Fjern medlem",
    });

    void run(){

        menu.fullMenu();


    }

    public static void main(String[] args){

        new Main().run();
    }
}
