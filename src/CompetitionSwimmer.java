import java.util.ArrayList;

public class CompetitionSwimmer extends Member { // EJERSKAB: ALEXANDER & FREYA
    private String swimDiscipline;

    private double backTrainingResult;
    private double breastTrainingResult;
    private double crawlTrainingResult;
    private double butterflyTrainingResult;

    public CompetitionSwimmer() {

    }

    public CompetitionSwimmer(String name, int age, String phoneNumber, String swimDiscipline) {
        super(name, age, phoneNumber);
        setSwimDiscipline(swimDiscipline);
    }

    public CompetitionSwimmer(String id, String name, int age, String phoneNumber, String swimDiscipline, Subscription subscription,
                              double breastTrainingResult, double backTrainingResult,
                              double crawlTrainingResult, double butterflyTrainingResult) {

        super(name, age, phoneNumber);
        setBreastTrainingResult(breastTrainingResult);
        setBackTrainingResult(backTrainingResult);
        setCrawlTrainingResult(crawlTrainingResult);
        setButterflyTrainingResult(butterflyTrainingResult);

    }


    // GETTERE
    public String getSwimDiscipline() {
        return swimDiscipline;
    }



    // SETTERE
    public void setSwimDiscipline(String swimDiscipline) {
        this.swimDiscipline = swimDiscipline;
    }





    public double getBackTrainingResult() {
        return backTrainingResult;
    }

    public void setBackTrainingResult(double backTrainingResult) {
        this.backTrainingResult = backTrainingResult;
    }

    public double getBreastTrainingResult() {
        return breastTrainingResult;
    }

    public void setBreastTrainingResult(double breastTrainingResult) {
        this.breastTrainingResult = breastTrainingResult;
    }

    public double getCrawlTrainingResult() {
        return crawlTrainingResult;
    }

    public void setCrawlTrainingResult(double crawlTrainingResult) {
        this.crawlTrainingResult = crawlTrainingResult;
    }

    public double getButterflyTrainingResult() {
        return butterflyTrainingResult;
    }

    public void setButterflyTrainingResult(double butterflyTrainingResult) {
        this.butterflyTrainingResult = butterflyTrainingResult;
    }
}

