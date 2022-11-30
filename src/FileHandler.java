import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class FileHandler { // EJERSKAB: MATHIAS

    // KLASSE KALD
    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();

    // FIL INSTANTIERING
    File fileCompetitionSwimmers = new File("competitionSwimmers.txt");
    File fileCrawlSwimmers = new File("crawlSwimmers.txt");
    File fileButterFlyers = new File("butterFlyers.txt");
    File fileBreastStrokers = new File("breastStrokers.txt");
    File fileBackStrokers = new File("backStrokers.txt");

    // SAVEFILE METODER
    public void saveFileCompetitionSwimmers(){

        try{
            PrintStream p = new PrintStream(fileCompetitionSwimmers);
            for (CompetitionSwimmer c: memberList.getCompetitionSwimmers()){
                p.print(c.getID() + ";");
                p.print(c.getName() + ";");
                p.print(c.getAge() + ";");
                p.print(c.getPhoneNumber() + ";");
                p.print(c.getSwimDiscipline() + ";");
                p.print(c.getSubscription());
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
                p.print(c.getPhoneNumber() + ";");
            }
            p.close();
        } catch (IOException e){
            ui.println("I/O exception: " + e.getMessage());
        }
    }
}
