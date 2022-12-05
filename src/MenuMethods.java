import java.util.ArrayList;
import java.util.Collections;

public class MenuMethods extends Member {
    private String teamOrNot;

    int counter = 0;
    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();

    // SORTERING
    CompetitionSorterBreast sorterBreast = new CompetitionSorterBreast();
    CompetitionSorterBack sorterBack = new CompetitionSorterBack();
    CompetitionSorterCrawl sorterCrawl = new CompetitionSorterCrawl();
    CompetitionSorterButterfly sorterButterfly = new CompetitionSorterButterfly();


    // EJERSKAB FREYA, DITTE, MATHIAS
    public void addMember() {
        setName(ui.readString("Indtast navn: "));
        setAge(ui.readInt("Indtast alder: "));
        ui.scannerBug();
        setPhoneNumber(ui.readString("Indtast telefonnummer: "));
        teamOrNot = ui.readString("Skal medlemmet træne på hold? ");
    }

    // EJERSKAB ALEXANDER & FREYA
    public void swimDiscipline() {
        boolean done = false;

        if (teamOrNot.equalsIgnoreCase("ja")) {

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
                    case 1 -> swimDiscipline = swimDiscipline.concat("Brystsvømning-");
                    case 2 -> swimDiscipline = swimDiscipline.concat("Rygsvømning-");
                    case 3 -> swimDiscipline = swimDiscipline.concat("Crawl-");
                    case 4 -> swimDiscipline = swimDiscipline.concat("Butterfly-");
                    case 5 -> done = true;
                }
            }
            while (!done);

            CompetitionSwimmer c = new CompetitionSwimmer(getName(), getAge(), getPhoneNumber(), swimDiscipline);
            memberList.getCompetitionSwimmers().add(c);


            if (swimDiscipline.contains("Brystsvømning")) {
                memberList.getBreastStrokers().add(c);
            }
            if (swimDiscipline.contains("Rygsvømning")) {
                memberList.getBackStrokers().add(c);
            }
            if (swimDiscipline.contains("Crawl")) {
                memberList.getCrawlSwimmers().add(c);
            }
            if (swimDiscipline.contains("Butterfly")) {
                memberList.getButterFlyers().add(c);
            }
            ui.println(c.getName() + "\n" + c.getAge() + "\n" +
                    c.getPhoneNumber() + "\n" + c.getSubscription() + "\n" + c.getID() + "\n" +
                    c.getSwimDiscipline());
        } else {
            RecreationalSwimmer m = new RecreationalSwimmer(getName(), getAge(), getPhoneNumber());
            ui.println(m.getName() + "\n" + m.getAge() + "\n" +
                    m.getPhoneNumber() + "\n" + m.getSubscription() + "\n" + m.getID());

            memberList.getRecreationalSwimmers().add(m);
            System.out.println(memberList.getRecreationalSwimmers().get(0));
        }
    }

    // EJERSKAB ALEXANDER & MATHIAS
    public void teamTotals() {
        ui.println("Antal konkurrencesvømmere:  " + memberList.getCompetitionSwimmers().size());
        ui.println("Bryst: " + memberList.getBreastStrokers().size());
        ui.println("Ryg: " + memberList.getBackStrokers().size());
        ui.println("Crawl: " + memberList.getCrawlSwimmers().size());
        ui.println("Butterfly: " + memberList.getButterFlyers().size());

    }

    // SORTERINGSMETODER // EJERSKAB DITTE & FREYA


    public void sortingBreast() {
        Collections.sort(memberList.getBreastStrokers(), sorterBreast);
        sortingTop5(memberList.getBreastStrokers(), "breast");
    }

    public void sortingBack() {
        Collections.sort(memberList.getBackStrokers(), sorterBack);
        sortingTop5(memberList.getBackStrokers(), "back");
    }

    public void sortingCrawl() {
        Collections.sort(memberList.getCrawlSwimmers(), sorterCrawl);
        sortingTop5(memberList.getCrawlSwimmers(), "crawl");
    }

    public void sortingButterfly() {
        Collections.sort(memberList.getButterFlyers(), sorterButterfly);
        sortingTop5(memberList.getButterFlyers(), "butterfly");
    }


    public void sortingTop5(ArrayList<CompetitionSwimmer> swimmerArrayList, String discipline) {

        ui.println(discipline + " TOP 5 Junior");
        counter = 0;

        for (int i = 0; i < swimmerArrayList.size(); i++) {

            if (swimmerArrayList.get(i).getSubscription() == Subscription.JUNIOR) {

                ui.println((counter + 1) + ". " + swimmerArrayList.get(i).getName() + ", " + swimmerArrayList.get(i).getID());
                if (discipline.contains("butterfly")) {
                    ui.println("\tResultat: " + memberList.getButterFlyers().get(i).getButterflyTrainingResult());
                } else if (discipline.contains("crawl")) {
                    ui.println("\tResultat: " + swimmerArrayList.get(i).getCrawlTrainingResult());
                } else if (discipline.contains("back")) {
                    ui.println("\tResultat: " + swimmerArrayList.get(i).getBackTrainingResult());
                } else {
                    ui.println("\tResultat: " + swimmerArrayList.get(i).getBreastTrainingResult());
                }

                counter++;
                if (counter == 5) {
                    i = swimmerArrayList.size();
                }
            }
        }

        ui.println(discipline + " TOP 5 Senior");
        counter = 0;

        for (int i = 0; i < swimmerArrayList.size(); i++) {
            if (swimmerArrayList.get(i).getSubscription() == Subscription.SENIOR ||
                    swimmerArrayList.get(i).getSubscription() == Subscription.PENSIONIST) {
                ui.println((counter + 1) + ". " + swimmerArrayList.get(i).getName() + ", " + swimmerArrayList.get(i).getID());
                if (discipline.contains("butterfly")) {
                    ui.println("\tResultat: " + swimmerArrayList.get(i).getButterflyTrainingResult());
                } else if (discipline.contains("crawl")) {
                    ui.println("\tResultat: " + swimmerArrayList.get(i).getCrawlTrainingResult());
                } else if (discipline.contains("back")) {
                    ui.println("\tResultat: " + swimmerArrayList.get(i).getBackTrainingResult());
                } else {
                    ui.println("\tResultat: " + swimmerArrayList.get(i).getBreastTrainingResult());
                }
                counter++;
                if (counter == 5) {
                    i = swimmerArrayList.size();
                }
            }
        }
    }

    public void getInArrears(){
        ui.println("Medlemmer i restance: ");
        System.out.printf("%s%13s%n", "ID", "NAVN");

        for (int i = 0; i < memberList.getCompetitionSwimmers().size(); i++) {
            if (memberList.getCompetitionSwimmers().get(i).isInArrears()) {
                    System.out.printf("%-11s", "[" +memberList.getCompetitionSwimmers().get(i).getID() + "]");
                    System.out.printf("%-30s%n", memberList.getCompetitionSwimmers().get(i).getName());
                }


            for (int j = 0; j < memberList.getRecreationalSwimmers().size(); j++) {
                if (memberList.getRecreationalSwimmers().get(i).isInArrears()){
                    System.out.printf("%-11s", "[" +memberList.getRecreationalSwimmers().get(i).getID() + "]");
                    System.out.printf("%-30s%n", memberList.getRecreationalSwimmers().get(i).getName());
                }
            }
        }
    }
}




