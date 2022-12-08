public class TrainingResult {
    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();

    public void enterTrainingResult() {
        String findID = ui.readString("Indtast medlems ID: ");

        for (CompetitionSwimmer c : memberList.getCompetitionSwimmers()) {
            if (findID.equals(c.getID())){
                ui.println("Medlemsnavn: "+c.getName());
                ui.println("Bruger ID:" + c.getID());

            boolean done = false;
                Menu menuDiscipline = new Menu("SVØMMEDISCIPLINER", "Vælg svømmedisciplin",
                    new String[]{
                            "1. Brystsvømning",
                            "2. Rygsvømning",
                            "3. Crawl",
                            "4. Butterfly",
                            "5. Ikke flere"
                    });

            do {
                menuDiscipline.printMenu();
                switch (menuDiscipline.readChoice()) {

                    case 1 -> {
                        ui.println("Brystsvømning:");
                        c.setBreastTrainingResult(ui.readDouble("Indtast træningsresultat: "));
                    }
                    case 2 -> {
                        ui.println("Rygsvømning:");
                        c.setBackTrainingResult(ui.readDouble("Indtast træningsresultat: "));
                    }
                    case 3 -> {
                        ui.println("Crawl:");
                        c.setCrawlTrainingResult(ui.readDouble("Indtast træningsresultat: "));
                    }
                    case 4 -> {
                        ui.println("Butterfly:");
                        c.setButterflyTrainingResult(ui.readDouble("Indtast træningsresultat: "));
                    }
                    case 5 -> done = true;
                }
            } while (!done);

            ui.println(c.getName() + " - "+ c.getID());
            ui.println("Bryst. "+c.getBreastTrainingResult());
            ui.println("Ryg. "+c.getBackTrainingResult());
            ui.println("Crawl. "+c.getCrawlTrainingResult());
            ui.println("Butterfly. "+c.getButterflyTrainingResult());
        }}
    }
}
