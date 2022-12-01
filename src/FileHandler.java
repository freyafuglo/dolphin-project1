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
    File fileCrawlSwimmers = new File("crawlSwimmers.txt");
    File fileButterFlyers = new File("butterFlyers.txt");
    File fileBreastStrokers = new File("breastStrokers.txt");
    File fileBackStrokers = new File("backStrokers.txt");

    // SAVE FILE METODER
    public void saveFileCompetitionSwimmers(){

        try{
            PrintStream p = new PrintStream(new FileOutputStream(fileCompetitionSwimmers));
            for (CompetitionSwimmer c: memberList.getCompetitionSwimmers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.print(c.getPhoneNumber() + ";");
                p.print(c.getSwimDiscipline() + ";");
                p.println(c.getSubscription());
            }
        p.close();
        } catch (IOException e){
            ui.println("I/O exception: " + e.getMessage());
        }
    }

    public void saveFileCrawlSwimmers(){

        try{
            PrintStream p = new PrintStream(fileCrawlSwimmers);
            for (CompetitionSwimmer c: memberList.getCrawlSwimmers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.println(c.getPhoneNumber());
            }
            p.close();
        } catch (IOException e){
            ui.println("I/O exception: " + e.getMessage());
        }
    }

    public void saveFileButterFlyers(){

        try{
            PrintStream p = new PrintStream(fileButterFlyers);
            for (CompetitionSwimmer c: memberList.getButterFlyers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.println(c.getPhoneNumber());
            }
            p.close();
        } catch (IOException e){
            ui.println("I/O exception: " + e.getMessage());
        }
    }

    public void saveFileBreastStrokers(){

        try{
            PrintStream p = new PrintStream(fileBreastStrokers);
            for (CompetitionSwimmer c: memberList.getBreastStrokers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.println(c.getPhoneNumber());
            }
            p.close();
        } catch (IOException e){
            ui.println("I/O exception: " + e.getMessage());
        }
    }

    public void saveFileBackStrokers(){

        try{
            PrintStream p = new PrintStream(fileBackStrokers);
            for (CompetitionSwimmer c: memberList.getBackStrokers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.println(c.getPhoneNumber());
            }
            p.close();
        } catch (IOException e){
            ui.println("I/O exception: " + e.getMessage());
        }
    }

    // LOAD FILE METODER
    public void loadFileCompetitionSwimmers(){
        memberList.getCompetitionSwimmers().clear();
        try{
        Scanner fileScanner = new Scanner(new File("competitionSwimmers.txt"));
        while(fileScanner.hasNext()){
            Scanner tokenScanner = new Scanner(fileScanner.nextLine()).useDelimiter(";");

            int id = Integer.parseInt(tokenScanner.next());
            String name = tokenScanner.next();
            int age = Integer.parseInt(tokenScanner.next());
            String phoneNumber = tokenScanner.next();
            String swimDiscipline = tokenScanner.next();
            Subscription subscription = Subscription.valueOf(tokenScanner.next());

            CompetitionSwimmer c = new CompetitionSwimmer(id, name, age, phoneNumber, swimDiscipline, subscription);
            memberList.getCompetitionSwimmers().add(c);

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
}
