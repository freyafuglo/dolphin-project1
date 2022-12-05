import java.util.Collections;

public class MenuMethods extends Member {
    private String teamOrNot;

    int counter = 0;
    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();
    FileHandler fileHandler = new FileHandler();

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

        // JUNIOR
        ui.println("BRYSTSVØMMERE TOP FEM JUNIOR");

        counter = 0;

            for (int i = 0; i < memberList.getBreastStrokers().size(); i++) {
                if(memberList.getBreastStrokers().get(i).getSubscription() == Subscription.JUNIOR){
                ui.printDouble(memberList.getBreastStrokers().get(i).getBreastTrainingResult());
                counter++;
                if(counter == 5){
                    i = memberList.getBreastStrokers().size();
                    }
                }
            }


        // SENIOR

        ui.println("RYGSVØMMERE TOP FEM SENIOR");

        counter = 0;

            for (int i = 0; i < memberList.getBreastStrokers().size(); i++) {
                if(memberList.getBreastStrokers().get(i).getSubscription() == Subscription.SENIOR){
                    ui.printDouble(memberList.getBreastStrokers().get(i).getBreastTrainingResult());
                    counter++;
                    if(counter == 5){
                        i = memberList.getBreastStrokers().size();
                    }
                }
            }
        }

    public void sortingBack() {
        Collections.sort(memberList.getBackStrokers(), sorterBack);
        ui.println("RYGSVØMMERE TOP FEM JUNIOR");

        // JUNIOR
        counter = 0;

            for (int i = 0; i < memberList.getBackStrokers().size(); i++) {
                if(memberList.getBackStrokers().get(i).getSubscription() == Subscription.JUNIOR){
                ui.printDouble(memberList.getBackStrokers().get(i).getBackTrainingResult());
                counter++;
                if(counter == 5){
                      i = memberList.getBackStrokers().size();
                    }
                }
            }

        // SENIOR
        counter = 0;

        ui.println("RYGSVØMMERE TOP FEM SENIOR");

            for (int i = 0; i < memberList.getBackStrokers().size(); i++) {
                if(memberList.getBackStrokers().get(i).getSubscription() == Subscription.SENIOR){
                    ui.printDouble(memberList.getBackStrokers().get(i).getBackTrainingResult());
                    counter++;
                    if(counter == 5){
                        i = memberList.getBackStrokers().size();
                    }
                }
            }
    }

    public void sortingCrawl() {
        Collections.sort(memberList.getCrawlSwimmers(), sorterCrawl);

        // JUNIOR
        ui.println("CRAWLSVØMMERE TOP FEM JUNIOR");

        counter = 0;


            for (int i = 0; i < memberList.getCrawlSwimmers().size(); i++) {
                if (memberList.getCrawlSwimmers().get(i).getSubscription() == Subscription.JUNIOR) {
                    ui.printDouble(memberList.getCrawlSwimmers().get(i).getCrawlTrainingResult());
                    counter++;
                    if (counter == 5) {
                        i = memberList.getCrawlSwimmers().size();
                    }
                }
            }

        // SENIOR
        counter = 0;

        ui.println("CRAWLSVØMMERE TOP FEM SENIOR");

            for (int i = 0; i < memberList.getCrawlSwimmers().size(); i++) {
                if (memberList.getCrawlSwimmers().get(i).getSubscription() == Subscription.SENIOR) {
                    ui.printDouble(memberList.getCrawlSwimmers().get(i).getCrawlTrainingResult());
                    counter++;
                    if (counter == 5) {
                        i = memberList.getCrawlSwimmers().size();
                    }
                }
            }
    }

    public void sortingButterfly() {
        Collections.sort(memberList.getButterFlyers(), sorterButterfly);

        // JUNIOR
        ui.println("BUTTERFLYSVØMMERE TOP FEM Junior");

        counter = 0;

            for (int j = 0; j < memberList.getButterFlyers().size(); j++) {
                if (memberList.getButterFlyers().get(j).getSubscription() == Subscription.JUNIOR) {
                    ui.printDouble(memberList.getButterFlyers().get(j).getButterflyTrainingResult());
                    counter++;
                    if (counter == 5) {
                        j = memberList.getButterFlyers().size();
                    }
                }
            }


        // SENIOR
        ui.println("BUTTERFLYSVØMMERE TOP FEM Senior");

        counter = 0;

            for (int i = 0; i < memberList.getButterFlyers().size(); i++) {
                if (memberList.getButterFlyers().get(i).getSubscription() == Subscription.SENIOR ||
                        memberList.getButterFlyers().get(i).getSubscription() == Subscription.PENSIONIST) {
                    ui.printDouble(memberList.getButterFlyers().get(i).getButterflyTrainingResult());
                    counter++;
                    if (counter == 5) {
                        i = memberList.getButterFlyers().size();
                    }
                }
            }


    }
}




