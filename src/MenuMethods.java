import java.util.ArrayList;

public class MenuMethods {
    private String teamOrNot;
    private String name;
    private String phoneNumber;
    private int age;
    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();
    FileHandler fileHandler = new FileHandler();

    public void addMember() {
        name = ui.readString("Indtast navn: ");
        age = ui.readInt("Indtast alder: ");
        ui.in.nextLine(); // SCANNERBUG
        phoneNumber = ui.readString("Indtast telefonnummer: ");
        teamOrNot = ui.readString("Skal medlemmet træne på hold? ");
    }

    public void swimDiscipline() {
        boolean done = false;

        if (teamOrNot.equals("ja")) {

            String swimDiscipline = "";
            Menu menuDiscipline = new Menu("SVØMMEDISCIPLINER", "Vælg svømmediscipliner",
                    new String[]{
                            "1. Brystsvømning",
                            "2. Rygsvømning",
                            "3. Crawl",
                            "4. Butterfly",
                            "5. Ikke flere"
                    });
            menuDiscipline.printMenu();

            do {
                switch (menuDiscipline.readChoice()) {
                    case 1 -> swimDiscipline = swimDiscipline.concat("Brystsvømning\n");
                    case 2 -> swimDiscipline = swimDiscipline.concat("Rygsvømning\n");
                    case 3 -> swimDiscipline = swimDiscipline.concat("Crawl\n");
                    case 4 -> swimDiscipline = swimDiscipline.concat("Butterfly\n");
                    case 5 -> done = true;
                }
            }

            while (!done);

            CompetitionSwimmer c = new CompetitionSwimmer(name, age, phoneNumber, swimDiscipline);
            memberList.getCompetitionSwimmers().add(c);
            fileHandler.saveFileCompetitionSwimmers();

            if (swimDiscipline.contains("Brystsvømning")){
                memberList.getBreastStrokers().add(c);
            }
            if (swimDiscipline.contains("Rygsvømning")){
                memberList.getBackStrokers().add(c);
            }
            if (swimDiscipline.contains("Crawl")){
                memberList.getCrawlSwimmers().add(c);
            }
            if (swimDiscipline.contains("Butterfly")){
                memberList.getButterFlyers().add(c);
            }
            ui.println(c.getName() + "\n" + c.getAge() + "\n" +
                    c.getPhoneNumber() + "\n" + c.getSubscription() + "\n" + c.getID() + "\n" +
                    c.getSwimDiscipline());
        } else {
            RecreationalSwimmer m = new RecreationalSwimmer(name, age, phoneNumber);
            ui.println(m.getName() + "\n" + m.getAge() + "\n" +
                    m.getPhoneNumber() + "\n" + m.getSubscription() + "\n" + m.getID());

            memberList.getRecreationalSwimmers().add(m);
            System.out.println(memberList.getRecreationalSwimmers().get(0));
        }
    }
}
