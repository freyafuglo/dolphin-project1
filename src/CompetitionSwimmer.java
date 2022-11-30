import java.util.ArrayList;

public class CompetitionSwimmer extends Member { // EJERSKAB: ALEXANDER & FREYA
private String swimDiscipline;

    public CompetitionSwimmer(){

    }
    public CompetitionSwimmer(String name, int age, String phoneNumber, String swimDiscipline)
    {
        super(name, age, phoneNumber);
        setSwimDiscipline(swimDiscipline);
    }

    public CompetitionSwimmer(int id, String name, int age, int phoneNumber, String swimDiscipline, Subscription subscription) {
        super(id, name, age, phoneNumber, swimDiscipline, subscription);
    }

    public void setSwimDiscipline(String swimDiscipline)
    {
        this.swimDiscipline = swimDiscipline;
    }

    public String getSwimDiscipline()
    {
        return swimDiscipline;
    }
}
