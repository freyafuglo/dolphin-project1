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

    public Member(){

    }

    public Member(String name, int age, String phoneNumber)
    {
        setName(name);
        setAge(age);
        setPhoneNumber(phoneNumber);
        isActive = true;
        setID();
        setSubscription();

    }

    public void isActive(boolean isActive) {

        this.isActive = isActive;
    }

    // SETTERE
    public void setAge(int age) {
        this.age = age;
    }

    public void setID() {
        //ID = "0000";
        idCounter++;
        ID = String.format("%04d", idCounter);
        //Alexanders alt for lange metode :´(
        //ID = ID.substring(String.valueOf(idCounter).length());
        //ID = ID.concat(String.valueOf(idCounter));
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
