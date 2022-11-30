import java.util.ArrayList;

public class MemberList { // EJERSKAB: ALEXANDER & FREYA & MATHIAS

    // ARRAYLISTS
    private ArrayList<CompetitionSwimmer> competitionSwimmers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> crawlSwimmers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> butterFlyers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> breastStrokers = new ArrayList<>();
    private ArrayList<CompetitionSwimmer> backStrokers = new ArrayList<>();

    // GETTERE
    public ArrayList<CompetitionSwimmer> getCompetitionSwimmers(){
        return competitionSwimmers;
    }
    public ArrayList<CompetitionSwimmer> getCrawlSwimmers(){
        return crawlSwimmers;
    }
    public ArrayList<CompetitionSwimmer> getButterFlyers(){
        return butterFlyers;
    }
    public ArrayList<CompetitionSwimmer> getBreastStrokers(){
        return breastStrokers;
    }
    public ArrayList<CompetitionSwimmer> getBackStrokers(){
        return backStrokers;
    }
}
