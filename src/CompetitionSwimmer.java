import java.util.ArrayList;

public class CompetitionSwimmer extends Member { // EJERSKAB: ALEXANDER & FREYA
private String swimDiscipline;

private double trainingResult = 00.00;

    public CompetitionSwimmer(){

    }

    public CompetitionSwimmer(String name, int age, String phoneNumber, String swimDiscipline)
    {
        super(name, age, phoneNumber);
        setSwimDiscipline(swimDiscipline);
    }

    public CompetitionSwimmer(int id, String name, int age, String phoneNumber, String swimDiscipline, Subscription subscription, double trainingResult) {
        super(name, age, phoneNumber);
        setTrainingResult(trainingResult);
    }


    // GETTERE
    public String getSwimDiscipline()
    {
        return swimDiscipline;
    }

    public double getTrainingResult() {
        return trainingResult;
    }

    // SETTERE
    public void setSwimDiscipline(String swimDiscipline)
    {
        this.swimDiscipline = swimDiscipline;
    }

    public void setTrainingResult(double trainingResult) {
        this.trainingResult = trainingResult;
    }
}
