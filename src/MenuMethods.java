import java.util.ArrayList;

public class MenuMethods {
    String teamOrNot;
    String name;
    String phoneNumber;
    int age;
    UserInterface ui = new UserInterface();



    //Konkurrence svømmere
    private ArrayList<CompetitionSwimmer> competitionSwimmers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> crawlSwimmers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> butterFlyers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> breastStrokers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> backStrokers = new ArrayList<>();

    //Motionssvømmere
    private ArrayList<RecreationalSwimmer> recreationalSwimmers = new ArrayList<>();

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
            competitionSwimmers.add(c);

            if (swimDiscipline.contains("Brystsvømning")){
                breastStrokers.add(c);
            }
            if (swimDiscipline.contains("Rygsvømning")){
                backStrokers.add(c);
            }
            if (swimDiscipline.contains("Crawl")){
                crawlSwimmers.add(c);
            }
            if (swimDiscipline.contains("Butterfly")){
                butterFlyers.add(c);
            }
            ui.println(c.getName() + "\n" + c.getAge() + "\n" +
                    c.getPhoneNumber() + "\n" + c.getSubscription() + "\n" + c.getID() + "\n" +
                    c.getSwimDiscipline());
        } else {
            RecreationalSwimmer m = new RecreationalSwimmer(name, age, phoneNumber);
            ui.println(m.getName() + "\n" + m.getAge() + "\n" +
                    m.getPhoneNumber() + "\n" + m.getSubscription() + "\n" + m.getID());

            recreationalSwimmers.add(m);
            System.out.println(getRecreationalList().get(0));
        }
    }
    public ArrayList getRecreationalList(){
        return recreationalSwimmers;
    }

    public ArrayList<CompetitionSwimmer> getCompetitionSwimmers() {
        return competitionSwimmers;
    }

    public ArrayList<CompetitionSwimmer> getBackStrokers() {
        return backStrokers;
    }

    public ArrayList<CompetitionSwimmer> getBreastStrokers() {
        return breastStrokers;
    }

    public ArrayList<CompetitionSwimmer> getButterFlyers() {
        return butterFlyers;
    }

    public ArrayList<RecreationalSwimmer> getRecreationalSwimmers() {
        return recreationalSwimmers;
    }

    public ArrayList<CompetitionSwimmer> getCrawlSwimmers() {
        return crawlSwimmers;
    }



}
