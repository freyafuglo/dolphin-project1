import java.util.ArrayList;
import java.util.Collections;

public class MenuMethods extends Member {
    private String teamOrNot;
    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();
    FileHandler fileHandler = new FileHandler();

    CompetitionSorterByTrainingresult sorterBreast = new CompetitionSorterByTrainingresult();



    public void addMember() {
        setName(ui.readString("Indtast navn: "));
        setAge(ui.readInt("Indtast alder: "));
        ui.scannerBug();
        setPhoneNumber(ui.readString("Indtast telefonnummer: "));
        teamOrNot = ui.readString("Skal medlemmet træne på hold? ");
    }

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

    public void teamTotals() {
        ui.println("Antal konkurrencesvømmere:  " + memberList.getCompetitionSwimmers().size());
        ui.println("Bryst: " + memberList.getBreastStrokers().size());
        ui.println("Ryg: " + memberList.getBackStrokers().size());
        ui.println("Crawl: " + memberList.getCrawlSwimmers().size());
        ui.println("Butterfly: " + memberList.getButterFlyers().size());

    }

    // SORTERINGSMETODER

    public void sortingBreast() {
        Collections.sort(memberList.getBreastStrokers(), sorterBreast);
        ui.println("BRYSTSVØMMERE TOP FEM");
        for(int i = 0; i < 5; i++){
            System.out.println(memberList.getBreastStrokers().get(i).getBreastTrainingResult());
        }
    }

    public void sortingBack() {
        Collections.sort(memberList.getBackStrokers(), sorterBreast);
        ui.println("BRYSTSVØMMERE TOP FEM");
        for(int i = 0; i < 5; i++){
            System.out.println(memberList.getBackStrokers().get(i).getBreastTrainingResult());
        }
    }

    public void sortingCrawl() {
        Collections.sort(memberList.getCrawlSwimmers(), sorterBreast);
        ui.println("BRYSTSVØMMERE TOP FEM");
        for(int i = 0; i < 5; i++){
            System.out.println(memberList.getCrawlSwimmers().get(i).getBreastTrainingResult());
        }
    }

    public void sortingButterfly() {
        Collections.sort(memberList.getButterFlyers(), sorterBreast);
        ui.println("BRYSTSVØMMERE TOP FEM");
        for(int i = 0; i < 5; i++){
            System.out.println(memberList.getButterFlyers().get(i).getBreastTrainingResult());
        }
    }


}
