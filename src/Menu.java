import java.util.Arrays;

public class Menu { // EJERSKAB: DITTE & MATHIAS
    private String menuHeader;
    private String leadText;
    private String[] menuItems;
    boolean validInput = true;
    UserInterface ui = new UserInterface();
    MenuMethods menuMethods = new MenuMethods();
    FileHandler fileHandler = new FileHandler();
    TrainingResult trainingResult = new TrainingResult();
    MemberListHandler memberListHandler = new MemberListHandler();

    public Menu(String menuHeader, String leadText, String[] menuItems) {
        this.menuHeader = menuHeader;
        this.leadText = leadText;
        this.menuItems = menuItems;
    }

    public void printMenu() {
        ui.println(menuHeader);
        System.out.println(Arrays.toString(menuItems)
                .replace("[", "")
                .replace("]", "")
                .replace(", ", "\n"));
        ui.println(leadText);
    }

    public int readChoice() {
        int menuChoice = 0;

        do {
            try {
                menuChoice = Integer.parseInt(ui.readString());

                if (menuChoice > 0 && menuChoice <= menuItems.length || menuChoice == 9) {
                    validInput = true;

                } else {
                    ui.println("Indtast et gyldigt punkt fra menuen.");
                    validInput = false;
                }
            } catch (NumberFormatException e) {
                ui.println("IKKE ET BOGSTAV!");
            }

        } while (!validInput);

        return menuChoice;
    }

    public void menuFull() {
        boolean done = false;

        do {
            printMenu();
            switch (readChoice()) {
                case 1:
                    ui.println("TILFØJ NYT MEDLEM");
                    menuMethods.addMember();
                    //menuMethods.decideSwimDiscipline();
                    break;
                case 2:
                    ui.println("FJERN MEDLEM: \n");
                    memberListHandler.deleteMember();
                    break;
                case 3:
                    ui.println("MEDLEMSLISTE");
                    memberListHandler.viewMemberlist();
                    break;
                case 4:
                    ui.println("HOLDLISTE");
                    menuMethods.teamTotals();
                    break;
                case 5:
                    ui.println("TOP FEM");
                    menuMethods.sortingBreast();
                    menuMethods.sortingBack();
                    menuMethods.sortingCrawl();
                    menuMethods.sortingButterfly();
                    break;
                case 6:
                    ui.println("REGNSKAB");
                    menuMethods.getInArrears();
                    break;

                case 7:
                    ui.println("ANGIV TRÆNINGSRESULTAT");
                    trainingResult.enterTrainingResult();
                    break;

                case 8:
                    ui.println("STÆVNERESULTATER");
                    fileHandler.loadCompetitionResults();
                    menuMethods.printCompetitionResults();
                    break;

                case 9:
                    ui.println("Farvel og tak!");
                    done = true;
                    break;
                default:
                    break;
            }
        } while (!done);
    }
}
