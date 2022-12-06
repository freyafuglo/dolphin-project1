import java.util.ArrayList;

public class Trainer {

    private String trainerName;

    private ArrayList<String> trainerSwimDiscipline = new ArrayList<>();

    private ArrayList<String> teamType = new ArrayList<>();

    // KONSTRUKTØR

    public Trainer(String trainerName){
        setTrainerName(trainerName);
    }

    // GETTERE

    public ArrayList<String> getTrainerSwimDiscipline(){
        return trainerSwimDiscipline;
    }

    public ArrayList<String> getTeamType(){
        return teamType;
    }

    // SETTERE

    public void setTrainerName(String trainerName){
        this.trainerName = trainerName;
    }

    public void setTrainerSwimDiscipline(ArrayList<String> trainerSwimDiscipline){
        this.trainerSwimDiscipline = trainerSwimDiscipline;
    }

    public void setTeamType(ArrayList<String> teamType){
        this.teamType = teamType;
    }

    public void addDiscipline(){
        trainerSwimDiscipline.add("Brystsvømning");
        trainerSwimDiscipline.add("Rygsvømning");
    }

    public void addTeamType(){
        teamType.add("JUNIOR brystsvømning");
        teamType.add("SENIOR brystsvømning");
        teamType.add("JUNIOR rygsvømning");

    }

public String toString()
{
    return trainerName;
}







}
