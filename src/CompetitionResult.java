import java.util.ArrayList;

public class CompetitionResult {
    private String ID;
    private String name;
    private String competition;
    private String place;
    private double time;




    CompetitionResult(){

    }

    CompetitionResult(String ID, String name, String competition, String place, double time){
        setName(name);
        setID(ID);
        setCompetition(competition);
        setPlace(place);
        setTime(time);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return ID;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getCompetition() {
        return competition;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }


}
