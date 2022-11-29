import java.util.Arrays;

public class Menu { // EJERSKAB: DITTE & MATHIAS

    private String menuHeader;
    private String leadText;
    private String[] menuItems;
    boolean validInput = true;

    UserInterface ui = new UserInterface();

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
            try{
            menuChoice = Integer.parseInt(ui.readString());

            if (menuChoice > 0 && menuChoice <= menuItems.length) {
                validInput = true;

            } else {
                ui.println("Indtast et gyldigt punkt fra menuen.");
                validInput = false;
            }
            }catch(NumberFormatException e){
                ui.println("IKKE ET BOGSTAV!");
            }

        } while (!validInput);

        return menuChoice;
    }

    public void menuContent() {

        printMenu();
        switchFunction();
    }


    public void fullMenu() {
        String backToMenu;

        do {
            menuContent();

            backToMenu = ui.readString("Tilbage til hovedmenu [j/n]?:");

        } while (backToMenu.equalsIgnoreCase("j"));

        ui.println("Hey heeey");
    }


    public void switchFunction() {

        switch (readChoice()) {
            case 1:
                ui.println("TILFØJ NYT MEDLEM");

                String name = ui.readString("Indtast navn: ");
                int age = ui.readInt("Indtast alder: ");
                ui.in.nextLine();
                String phoneNumber = ui.readString("Indtast telefonnummer: ");
                String holdEllerEj = ui.readString("Skal medlemmet træne på hold? ");

                boolean done = false;

                if (holdEllerEj.equals("ja"))
                {
                    String swimDiscipline = "";
                    Menu menu = new Menu("SVØMMEDISCIPLINER", "Vælg svømmediscipliner",
                            new String[]{
                                    "1. Brystsvømning",
                                    "2. Rygsvømning",
                                    "3. Crawl",
                                    "4. Butterfly",
                                    "5. Ikke flere"
                            });

                    menu.printMenu();

                    do {
                        switch (readChoice()){
                            case 1 -> swimDiscipline = swimDiscipline.concat("Brystsvømning\n");
                            case 2 -> swimDiscipline = swimDiscipline.concat("Rygvømning\n");
                            case 3 -> swimDiscipline = swimDiscipline.concat("Crawl\n");
                            case 4 -> swimDiscipline = swimDiscipline.concat("Butterfly\n");
                            case 5 -> done = true;
                        }
                    }
                    while (!done);

                    CompetitionSwimmer c = new CompetitionSwimmer(name, age, phoneNumber, swimDiscipline);

                    ui.println(c.getName() + "\n" + c.getAge() + "\n" +
                            c.getPhoneNumber() + "\n" +  c.getSubscription() + "\n" + c.getID() + "\n" +
                            c.getSwimDiscipline());
                }
                else
                {
                    Member m = new RecreationalSwimmer(name, age, phoneNumber);

                    ui.println(m.getName() + "\n" + m.getAge() + "\n" +
                            m.getPhoneNumber() + "\n" +  m.getSubscription() + "\n" + m.getID());
                }



                break;
            case 2:
                ui.println("REDIGER MEDLEM");
                //Bestem om aktiv eller passiv
                String aktivEllerPassiv = ui.readString("Tast ja for aktiv eller nej for passiv");

                if (aktivEllerPassiv.equals("ja"))
                {}

                break;
            case 3:
                ui.println("MEDLEMSLISTE");

                break;
            case 4:
                ui.println("HOLDLISTE");

                break;
            case 5:
                ui.println("TOP FEM");

                break;
            case 6:
                ui.println("REGNSKAB");

                break;

            default:
                break;

        }
    }
}
