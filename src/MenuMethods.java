public class MenuMethods {
    String teamOrNot;
    String name;
    String phoneNumber;
    int age;
    UserInterface ui = new UserInterface();
    Menu menu = new Menu();

    public void addMember() {
        name = ui.readString("Indtast navn: ");
        age = ui.readInt("Indtast alder: ");
        ui.in.nextLine();
        phoneNumber = ui.readString("Indtast telefonnummer: ");
        teamOrNot = ui.readString("Skal medlemmet træne på hold? ");
    }

    public void swimDiscipline() {
        boolean done = false;

        if (teamOrNot.equals("ja")) {
            String swimDiscipline = "";
            Menu menuDescipline = new Menu("SVØMMEDISCIPLINER", "Vælg svømmediscipliner",
                    new String[]{
                            "1. Brystsvømning",
                            "2. Rygsvømning",
                            "3. Crawl",
                            "4. Butterfly",
                            "5. Ikke flere"
                    });
            menuDescipline.printMenu();

            do {
                switch (menuDescipline.readChoice()) {
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
                    c.getPhoneNumber() + "\n" + c.getSubscription() + "\n" + c.getID() + "\n" +
                    c.getSwimDiscipline());
        } else {
            Member m = new RecreationalSwimmer(name, age, phoneNumber);
            ui.println(m.getName() + "\n" + m.getAge() + "\n" +
                    m.getPhoneNumber() + "\n" + m.getSubscription() + "\n" + m.getID());
        }
    }
}
