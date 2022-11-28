import java.util.Arrays;

public class Menu {

    private String menuHeader;
    private String leadText;
    private String[] menuItems;

    UserInterface ui = new UserInterface();

    public void Menu(String menuHeader, String leadText, String[] menuItems) {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }

    public void printMenu() {
        ui.println(menuHeader);
        System.out.println(Arrays.toString(menuItems)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "\n"));
        ui.println(leadText);
    }

    public int readChoice() {
        int menuChoice;
        boolean isRunning = true;

        do {
            menuChoice = ui.readInt();

            if (menuChoice > 0 && menuChoice <= menuItems.length) {
                isRunning = true;
            } else {
                ui.println("Indstast et gyldigt punkt fra menuen.");
            }

        } while (!isRunning);

        return menuChoice;
    }

    public void menuContent() {

        printMenu();
        menuSwitch();

    }

    public void menuSwitch() {

        switch (readChoice()) {
            case 1:
                ui.println("TILFØJ NYT MEDLEM");
            case 2:
                ui.println("REDIGER MEDLEM");
            case 3:
                ui.println("MEDLEMSLISTE");
            case 4:
                ui.println("TOP 5");
            case 5:
                ui.println("REDIGER MEDLEM");
            case 6:
                ui.println("REGNSKAB");
            case 7:
                ui.println("HOLDLISTE");
            case 8:
                ui.println("FJERN MEDLEM");
            default:
                ui.println("Prøv igen...");

        }
    }
}
