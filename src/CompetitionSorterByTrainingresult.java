import java.util.Comparator;

public class CompetitionSorterByTrainingresult implements Comparator<CompetitionSwimmer> {


    @Override
    public int compare(CompetitionSwimmer o1, CompetitionSwimmer o2) {

        return Double.compare(o1.getBreastTrainingResult(), o2.getBreastTrainingResult());


    }
}
