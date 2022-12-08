public class CompetitionResult { // EJERSKAB ALEXANDER
    private String ID;
    private String name;
    private String competition;
    private String place;
    private double time;

    // KONSTUKTØR

    CompetitionResult(String ID, String name, String competition, String place, double time){
        setName(name);
        setID(ID);
        setCompetition(competition);
        setPlace(place);
        setTime(time);
    }

    // SETTERE
    public void setName(String name) {
        this.name = name;
    }
    public void setID(String ID){
        this.ID = ID;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(double time) {
        this.time = time;
    }

    // GETTERE

    public String getName() {
        return name;
    }

    public String getID(){
        return ID;
    }

    public String getCompetition() {
        return competition;
    }

    public String getPlace() {
        return place;
    }

    public double getTime() {
        return time;
    }


}
