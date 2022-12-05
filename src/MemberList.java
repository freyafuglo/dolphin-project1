import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MemberList { // EJERSKAB: ALEXANDER & FREYA & MATHIAS

    UserInterface ui = new UserInterface();

    // ARRAYLISTS
    private static ArrayList<CompetitionSwimmer> competitionSwimmers = new ArrayList<>();
    private static ArrayList<CompetitionSwimmer> crawlSwimmers = new ArrayList<>();
    private static ArrayList<CompetitionSwimmer> butterFlyers = new ArrayList<>();
    private static ArrayList<CompetitionSwimmer> breastStrokers = new ArrayList<>();
    private static ArrayList<CompetitionSwimmer> backStrokers = new ArrayList<>();
    private static ArrayList<RecreationalSwimmer> recreationalSwimmers = new ArrayList<>();

    // GETTERE
    public ArrayList<CompetitionSwimmer> getCompetitionSwimmers() {
        return competitionSwimmers;
    }

    public ArrayList<CompetitionSwimmer> getCrawlSwimmers() {
        return crawlSwimmers;
    }

    public ArrayList<CompetitionSwimmer> getButterFlyers() {

        return butterFlyers;
    }

    public ArrayList<CompetitionSwimmer> getBreastStrokers() {
        return breastStrokers;
    }

    public ArrayList<CompetitionSwimmer> getBackStrokers() {
        return backStrokers;
    }
    public ArrayList<RecreationalSwimmer> getRecreationalSwimmers() {
        return recreationalSwimmers;
    }


}

