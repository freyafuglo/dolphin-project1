import java.util.ArrayList;

public abstract class Member { // EJERSKAB: ALEXANDER & FREYA
    private String name;
    private int age;
    private String phoneNumber;
    private boolean isActive;
    private static int idCounter;
    private String ID = "0000";
    private ArrayList<Member> members = new ArrayList<>();

    UserInterface ui = new UserInterface();

    public Member(String name, int age, String phoneNumber, boolean active)
    {
        setName(name);
        setAge(age);
        setPhoneNumber(phoneNumber);
        isActive(active);
        setID();

    }

    public void isActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
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
