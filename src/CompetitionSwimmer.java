import java.util.ArrayList;

public class CompetitionSwimmer extends Member { // EJERSKAB: ALEXANDER & FREYA
    private String swimDiscipline;

    private double backTrainingResult;
    private double breastTrainingResult;
    private double crawlTrainingResult;
    private double butterflyTrainingResult;

    private Trainer trainer;

    public CompetitionSwimmer() {
    }

    public CompetitionSwimmer(String name, int age, String phoneNumber, String swimDiscipline) {
        super(name, age, phoneNumber);
        setSwimDiscipline(swimDiscipline);
    }

    public CompetitionSwimmer(String id, String name, int age, String phoneNumber, String swimDiscipline,
                              Subscription subscription,
                              double breastTrainingResult, double backTrainingResult,
                              double crawlTrainingResult, double butterflyTrainingResult, boolean inArrears,
                              Trainer trainer) {
        super(name, age, phoneNumber);
        setSwimDiscipline(swimDiscipline);
        setBreastTrainingResult(breastTrainingResult);
        setBackTrainingResult(backTrainingResult);
        setCrawlTrainingResult(crawlTrainingResult);
        setButterflyTrainingResult(butterflyTrainingResult);
        setInArrears(inArrears);
        setTrainer(trainer);

    }

    // GETTERE
    public String getSwimDiscipline() {
        return swimDiscipline;
    }

    public double getBackTrainingResult() {
        return backTrainingResult;
    }

    public double getBreastTrainingResult() {
        return breastTrainingResult;
    }

    public double getCrawlTrainingResult() {
        return crawlTrainingResult;
    }

    public double getButterflyTrainingResult() {
        return butterflyTrainingResult;
    }

    public Trainer getTrainer(){
        return trainer;
    }

    // SETTERE
    public void setSwimDiscipline(String swimDiscipline) {
        this.swimDiscipline = swimDiscipline;
    }

    public void setBackTrainingResult(double backTrainingResult) {
        this.backTrainingResult = backTrainingResult;
    }

    public void setBreastTrainingResult(double breastTrainingResult) {
        this.breastTrainingResult = breastTrainingResult;
    }

    public void setCrawlTrainingResult(double crawlTrainingResult) {
        this.crawlTrainingResult = crawlTrainingResult;
    }

    public void setButterflyTrainingResult(double butterflyTrainingResult) {
        this.butterflyTrainingResult = butterflyTrainingResult;
    }

    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }

}

