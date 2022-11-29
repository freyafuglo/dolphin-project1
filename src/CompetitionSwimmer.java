import java.util.ArrayList;

public class CompetitionSwimmer extends Member { // EJERSKAB: ALEXANDER & FREYA
private String swimDiscipline;


    public CompetitionSwimmer(String name, int age, String phoneNumber, boolean active, String swimDiscipline)
    {
        super(name, age, phoneNumber, active);
        setSwimDiscipline(swimDiscipline);
    }

    public void setSwimDiscipline(String swimDiscipline)
    {
        this.swimDiscipline = swimDiscipline;
    }
}
