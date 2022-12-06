import java.util.ArrayList;

public class Trainer { // EJERSKAB DITTE OG FREYA

    private String trainerName;

    // KONSTRUKTØR

    public Trainer(String trainerName){
        setTrainerName(trainerName);
    }

    // SETTERE

    public void setTrainerName(String trainerName){
        this.trainerName = trainerName;
    }

public String toString()
{
    return trainerName;
}







}
