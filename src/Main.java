public class Main{

    UserInterface ui = new UserInterface();

    Menu menu = new Menu("HOVEDMENU", "Vælg menupunkt: ", new String[]{
            "1. Tilføj nyt medlem",
            "2. Rediger medlem",
            "3. Medlemsliste",
            "4. Top 5",
            "5. Regnskab",
            "6. Holdliste",
    });

    void run(){
        menu.fullMenu();

    }

    public static void main(String[] args){

        new Main().run();
    }

}
