public abstract class Member { // EJERSKAB: ALEXANDER & FREYA
    private String name;
    private int age;
    private String phoneNumber;
    private boolean isActive;
    private static int idCounter;
    private String ID = null;
    private Subscription subscription;
    private boolean inArrears;

    public boolean isInArrears() {
        return inArrears;
    }

    public void setInArrears(boolean inArrears) {
        this.inArrears = inArrears;
    }

    UserInterface ui = new UserInterface();
    MemberList memberList = new MemberList();

    // KONSTRUKTØRER
    public Member(){

    }

    public Member(String name, int age, String phoneNumber) {
        setName(name);
        setAge(age);
        setPhoneNumber(phoneNumber);
        isActive = true;
        createID();
        setSubscription();

    }
    public void isActive(boolean isActive) {

        this.isActive = isActive;

    }

    // SETTERE
    public void setAge(int age) {
        this.age = age;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public void createID() {
        int idSum = 0;
        if (memberList.getRecreationalSwimmers().size() > 0 || memberList.getCompetitionSwimmers().size() > 0) {
            for (CompetitionSwimmer c : memberList.getCompetitionSwimmers()) {
                if (Integer.parseInt(c.getID()) > idSum) {
                    idSum = Integer.parseInt(c.getID());
                }}
            for (RecreationalSwimmer r : memberList.getRecreationalSwimmers()) {
                if (Integer.parseInt(r.getID()) > idSum) {
                    idSum = Integer.parseInt(r.getID());
                }
            } idCounter = idSum;
        }
        idCounter++;
        ID = String.format("%04d", idCounter);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSubscription() {
        if (isActive) {
            if (age < 18) {
                this.subscription = Subscription.JUNIOR;
            }
            else if (age < 60) {
                this.subscription = Subscription.SENIOR;
            }
            else {
                this.subscription = Subscription.PENSIONIST;
            }
        }
        else
            this.subscription = Subscription.PASSIV;
    }

    // GETTERE
    public Subscription getSubscription() {
        return subscription;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getID() {
        return ID;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isActive() {
        return this.isActive;
    }
}
