public class Main {
    FileHandler fileHandler = new FileHandler();
    Menu menu = new Menu("HOVEDMENU", "Vælg menupunkt: ", new String[] {
            "1. Tilføj nyt medlem",
            "2. Rediger medlem",
            "3. Medlemsliste",
            "4. Holdliste",
            "5. Top fem",
            "6. Restanceliste",
            "7. Angiv træningsresultat",
            "8. Stævneresultater",
            "9. Afslut program"
    });
    void run() {
        fileHandler.loadFiles();
        menu.menuFull();
        fileHandler.saveFiles();
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
