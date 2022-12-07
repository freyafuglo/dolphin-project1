import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHandler { // EJERSKAB: MATHIAS & DITTE

    // KLASSE KALD
    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();

    // FIL INSTANTIERING
    File fileCompetitionSwimmers = new File("competitionSwimmers.txt");
    File fileRecreationalSwimmers = new File("recreationalSwimmers.txt");

    // SAVE FILE METODE
    public void saveFileCompetitionSwimmers(){

        try{
            PrintStream p = new PrintStream(new FileOutputStream(fileCompetitionSwimmers));
            for (CompetitionSwimmer c: memberList.getCompetitionSwimmers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.print(c.getPhoneNumber() + ";");
                p.print(c.getSwimDiscipline() + ";");
                p.print(c.getSubscription() + ";");
                p.print(c.getBreastTrainingResult() + ";");
                p.print(c.getBackTrainingResult() + ";");
                p.print(c.getCrawlTrainingResult() + ";");
                p.print(c.getButterflyTrainingResult()+";");
                p.print(c.isInArrears()+";");
                p.println(c.getTrainer());
            }
        p.close();
        } catch (IOException e){
            ui.println("I/O exception: " + e.getMessage());
        }
    }
    public void saveRecreationalSwimmers(){
        try{
            PrintStream p = new PrintStream(new FileOutputStream(fileRecreationalSwimmers));
            for (RecreationalSwimmer c : memberList.getRecreationalSwimmers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.print(c.getPhoneNumber() + ";");
                p.print(c.getSubscription() + ";");
                p.println(c.isInArrears());

            }
            p.close();
        }catch(IOException e){
            ui.println("I/O Exception: " + e);
        }
    }

    // LOAD FILE METODE, SOM AUT. SORTERER EFTER DISCPLINER
    public void loadFileCompetitionSwimmers(){
        memberList.getCompetitionSwimmers().clear();
        try{
        Scanner fileScanner = new Scanner(new File("competitionSwimmers.txt"));
        while(fileScanner.hasNext()){
            Scanner tokenScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");

            String id = tokenScanner.next();
            String name = tokenScanner.next();
            int age = Integer.parseInt(tokenScanner.next());
            String phoneNumber = tokenScanner.next();
            String swimDiscipline = tokenScanner.next();
            Subscription subscription = Subscription.valueOf(tokenScanner.next());
            double breast = Double.parseDouble(tokenScanner.next());
            double back = Double.parseDouble(tokenScanner.next());
            double crawl = Double.parseDouble(tokenScanner.next());
            double butter = Double.parseDouble(tokenScanner.next());
            boolean inArrears = Boolean.parseBoolean(tokenScanner.next());
            String trainerName = tokenScanner.next();
            Trainer trainer = new Trainer(trainerName);

            CompetitionSwimmer c = new CompetitionSwimmer(id, name, age, phoneNumber,
                    swimDiscipline, subscription, breast, back, crawl, butter, inArrears, trainer);

            memberList.getCompetitionSwimmers().add(c);

            //problem 2 løst
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
        }
        fileScanner.close();

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void loadFileRecreationalSwimmers(){
        memberList.getRecreationalSwimmers().clear();
        try{
            Scanner fileScanner = new Scanner(new File("recreationalSwimmers.txt"));
            while(fileScanner.hasNext()){
                Scanner tokenScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");
                String id = tokenScanner.next();
                String name = tokenScanner.next();
                int age = Integer.parseInt(tokenScanner.next());
                String phoneNumber = tokenScanner.next();
                Subscription subscription = Subscription.valueOf(tokenScanner.next());
                boolean inArrears = Boolean.parseBoolean(tokenScanner.next());

                RecreationalSwimmer r = new RecreationalSwimmer(id, name, age, phoneNumber, subscription, inArrears);
                memberList.getRecreationalSwimmers().add(r);

            }
            fileScanner.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void loadFiles(){
        loadFileCompetitionSwimmers();
        loadFileRecreationalSwimmers();
    }
    public void saveFiles(){
        saveFileCompetitionSwimmers();
        saveRecreationalSwimmers();
    }
    public void loadCompetitionResults(){
        try {
            Scanner fileScanner = new Scanner(new File("CompetitionResults.txt"));
            while (fileScanner.hasNextLine()){
                Scanner tokenScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");

                String ID = tokenScanner.next();
                String name = tokenScanner.next();
                String competition = tokenScanner.next();
                String place = tokenScanner.next();
                Double time = Double.parseDouble(tokenScanner.next());

                CompetitionResult cr = new CompetitionResult(ID,name,competition,place,time);
                memberList.getCompetitionResults().add(cr);
            }
            fileScanner.close();

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
