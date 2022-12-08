import java.util.ArrayList;

public class RecreationalSwimmer extends Member { // EJERSKAB: ALEXANDER & FREYA

    private ArrayList<RecreationalSwimmer> recreationalSwimmers = new ArrayList<>();

    public RecreationalSwimmer(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber);
    }
    public RecreationalSwimmer(String id, String name, int age, String phoneNumber, Subscription subscription, boolean inArrears) {
        super(name, age, phoneNumber);
        setInArrears(inArrears);
    }
}
