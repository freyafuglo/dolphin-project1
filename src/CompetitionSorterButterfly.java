import java.util.Comparator;

public class CompetitionSorterButterfly implements Comparator<CompetitionSwimmer> {

    public int compare(CompetitionSwimmer o1, CompetitionSwimmer o2) {

        return Double.compare(o1.getButterflyTrainingResult(), o2.getButterflyTrainingResult());

    }
}
