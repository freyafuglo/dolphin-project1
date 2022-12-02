import java.util.Comparator;

public class CompetitionSorterByTrainingresult implements Comparator<CompetitionSwimmer>
{
    @Override
    public int compare(CompetitionSwimmer o1, CompetitionSwimmer o2) {
        return Double.compare(o1.getBreastTrainingResult(), o2.getBreastTrainingResult()) +
                Double.compare(o1.getBackTrainingResult(), o2.getBackTrainingResult()) +
                Double.compare(o1.getCrawlTrainingResult(), o2.getCrawlTrainingResult() +
                        Double.compare(o1.getButterflyTrainingResult(), o2.getButterflyTrainingResult()));
    }
}
