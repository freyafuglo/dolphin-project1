public class MemberListHandler {

    MemberList memberList = new MemberList();
    UserInterface ui = new UserInterface();

    public void viewMemberlist() {
        for (int i = 0; i < memberList.getCompetitionSwimmers().size(); i++) {
            System.out.printf("%-12s", "[ID: " + memberList.getCompetitionSwimmers().get(i).getID() + "]");
            System.out.printf("%-30s", "NAVN: " + memberList.getCompetitionSwimmers().get(i).getName());
            System.out.printf("%-14s", "ALDER: " + memberList.getCompetitionSwimmers().get(i).getAge());
            System.out.printf("%-20s", "TLF.: " + memberList.getCompetitionSwimmers().get(i).getPhoneNumber());
            System.out.printf("%-15s %n", "KONTINGENT: " + memberList.getCompetitionSwimmers().get(i).getSubscription());
        }
    }

    public void deleteMember(){
        int indexOfChoice = ui.readInt("Hvilket medlem vil du have slettet [Indtast ID]?: ");
        memberList.getCompetitionSwimmers().remove(indexOfChoice);
        ui.println("Medlem med ID: " + indexOfChoice + ", er blevet slettet.");
    }
}