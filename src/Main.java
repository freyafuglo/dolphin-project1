public class Main{

    UserInterface ui = new UserInterface();

    Menu menu = new Menu("HOVEDMENU", "Vælg menupunkt: ", new String[]{
            "1. Tilføj nyt medlem",
            "2. Rediger medlem",
            "3. Medlemsliste",
            "4. Holdliste",
            "5. Top fem",
            "6. Regnskab",
    });

    void run(){
        menu.fullMenu();

    }

    public static void main(String[] args){

        new Main().run();
    }

}
