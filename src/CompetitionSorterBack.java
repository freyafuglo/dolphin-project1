import java.util.Comparator;

public class CompetitionSorterBack implements Comparator<CompetitionSwimmer> { // Ditte & co

    public int compare(CompetitionSwimmer o1, CompetitionSwimmer o2) {

        return Double.compare(o1.getBackTrainingResult(), o2.getBackTrainingResult());

    }
}
