public class MemberListHandler {

    MemberList memberList = new MemberList();
    UserInterface ui = new UserInterface();

    public void viewMemberlist() {
        System.out.printf("%s %13s %30s %34s %n", "ID", "NAVN", "ALDER", "KONTINGENT");

        for (int i = 0; i < memberList.getCompetitionSwimmers().size(); i++) {

            System.out.printf("%-12s", "[" +memberList.getCompetitionSwimmers().get(i).getID() + "]");
            System.out.printf("%-30s", memberList.getCompetitionSwimmers().get(i).getName());
            System.out.printf("%-10s", memberList.getCompetitionSwimmers().get(i).getAge());
            System.out.printf("%-20s", "TLF.: " + memberList.getCompetitionSwimmers().get(i).getPhoneNumber());
            System.out.printf("%-15s %n", memberList.getCompetitionSwimmers().get(i).getSubscription());
        }
    }

    public void deleteMember(){
        int indexOfChoice = ui.readInt("Hvilket medlem vil du have slettet [Indtast ID]?: ");
        memberList.getCompetitionSwimmers().remove(indexOfChoice);
        ui.println("Medlem med ID: [" + indexOfChoice + "], er blevet slettet.");
    }
}