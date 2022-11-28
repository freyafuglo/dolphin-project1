import java.util.ArrayList;

public class CompetitionSwimmer extends Member { // EJERSKAB: ALEXANDER & FREYA
    private ArrayList<CompetitionSwimmer> competitionSwimmers = new ArrayList<>();


    public CompetitionSwimmer(String name, int age, String phoneNumber, boolean active)
    {
        super(name, age, phoneNumber, active);
    }
}
