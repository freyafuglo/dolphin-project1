public class MemberListHandler {

    MemberList memberList = new MemberList();
    UserInterface ui = new UserInterface();

    public void viewMemberlist() {
        System.out.printf("%s %13s %30s %34s %n", "ID", "NAVN", "ALDER", "KONTINGENT");

        for (int i = 0; i < memberList.getCompetitionSwimmers().size(); i++) {

            System.out.printf("%-12s", "[" + memberList.getCompetitionSwimmers().get(i).getID() + "]");
            System.out.printf("%-30s", memberList.getCompetitionSwimmers().get(i).getName());
            System.out.printf("%-10s", memberList.getCompetitionSwimmers().get(i).getAge());
            System.out.printf("%-20s", "TLF.: " + memberList.getCompetitionSwimmers().get(i).getPhoneNumber());
            System.out.printf("%-15s %n", memberList.getCompetitionSwimmers().get(i).getSubscription());
        }
        for (int i = 0; i < memberList.getRecreationalSwimmers().size(); i++) {

            System.out.printf("%-12s", "[" + memberList.getRecreationalSwimmers().get(i).getID() + "]");
            System.out.printf("%-30s", memberList.getRecreationalSwimmers().get(i).getName());
            System.out.printf("%-10s", memberList.getRecreationalSwimmers().get(i).getAge());
            System.out.printf("%-20s", "TLF.: " + memberList.getRecreationalSwimmers().get(i).getPhoneNumber());
            System.out.printf("%-15s %n", memberList.getRecreationalSwimmers().get(i).getSubscription());
        }
    }

    public void deleteMember() {
        String idOfChoice = ui.readString("Hvilket medlem vil du have slettet [Indtast ID]?: ");
        for (int i = 0; i < memberList.getCompetitionSwimmers().size(); i++) {
            if (memberList.getCompetitionSwimmers().get(i).getID().equals(idOfChoice)) {
                memberList.getCompetitionSwimmers().remove(i);
            }
        }
        ui.println("Medlem med ID: [" + idOfChoice + "], er blevet slettet.");
    }
}