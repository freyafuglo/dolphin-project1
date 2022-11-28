import java.util.ArrayList;

public abstract class Member { // EJERSKAB: FREYA & ALEXANDER
    private String name;
    private int age;
    private String phoneNumber;
    private boolean active;
    private static int idCounter;
    private String ID = "0000";
    private ArrayList<Member> members = new ArrayList<>();

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public void setID(String ID) {
        idCounter++;
        ID = ID.substring(((ID.length())-(String.valueOf(idCounter).length())));
        ID = ID.concat(String.valueOf(idCounter));
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber)
    {
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

    public boolean isActive()
    {
        return this.active;
    }
}
