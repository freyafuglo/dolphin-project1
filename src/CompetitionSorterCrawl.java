import java.util.Comparator;

public class CompetitionSorterCrawl implements Comparator<CompetitionSwimmer> {

    public int compare(CompetitionSwimmer o1, CompetitionSwimmer o2) {

        return Double.compare(o1.getCrawlTrainingResult(), o2.getCrawlTrainingResult());

    }
}
