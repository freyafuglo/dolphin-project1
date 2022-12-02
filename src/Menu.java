import java.util.Arrays;

public class Menu { // EJERSKAB: DITTE & MATHIAS

    private String menuHeader;
    private String leadText;
    private String[] menuItems;
    boolean validInput = true;
    UserInterface ui = new UserInterface();
    MenuMethods menuMethods = new MenuMethods();
    FileHandler fileHandler = new FileHandler();
    MemberList memberList = new MemberList();
    TrainingResult trainingResult = new TrainingResult();



    public Menu() {

    }

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
                    menuMethods.swimDiscipline();
                    break;
                case 2:
                    ui.println("REDIGER MEDLEM");
                    //Bestem om aktiv eller passiv
                    String aktivEllerPassiv = ui.readString("Tast ja for aktiv eller nej for passiv");

                    if (aktivEllerPassiv.equals("ja")) {
                    }
                    break;
                case 3:
                    ui.println("MEDLEMSLISTE");
                    ui.println(memberList.getCompetitionSwimmers().toString());
                    break;
                case 4:
                    ui.println("HOLDLISTE");
                    menuMethods.teamTotals();
                    break;
                case 5:
                    ui.println("TOP FEM");
                    menuMethods.sortingMethod();
                    break;
                case 6:
                    ui.println("REGNSKAB");
                    break;

                case 7:
                    ui.println("ANGIV TRÆNINGSRESULTAT");
                    trainingResult.enterTrainingResult();
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
