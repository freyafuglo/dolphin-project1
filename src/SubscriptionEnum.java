public enum SubscriptionEnum {
    JUNIOR(1000),
    SENIOR(1600);

    public final int kontingent;

    SubscriptionEnum(int kontingent) {
        this.kontingent = kontingent;
    }

    public int getKontingent(){
        return kontingent;
    }
}
