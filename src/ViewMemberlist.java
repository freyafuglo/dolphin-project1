public class ViewMemberlist {

    MemberList memberList = new MemberList();

    public void viewMemberlist() {
        for (int i = 0; i < memberList.getCompetitionSwimmers().size(); i++) {
            System.out.printf("%-12s", "[ID: " + memberList.getCompetitionSwimmers().get(i).getID() + "]");
            System.out.printf("%-30s", "NAVN: " + memberList.getCompetitionSwimmers().get(i).getName());
            System.out.printf("%-14s", "ALDER: " + memberList.getCompetitionSwimmers().get(i).getAge());
            System.out.printf("%-20s", "TLF.: " + memberList.getCompetitionSwimmers().get(i).getPhoneNumber());
            System.out.printf("%-15s %n", "KONTINGENT: " + memberList.getCompetitionSwimmers().get(i).getSubscription());
        }
    }
}