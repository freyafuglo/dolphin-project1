public enum Subscription {
    JUNIOR(1000),
    SENIOR(1600),
    PENSIONIST(SENIOR.getKontingent() * 0.75),
    PASSIV(500);

    public final double kontingent;

    Subscription(double kontingent) {
        this.kontingent = kontingent;
    }

    public double getKontingent(){
        return kontingent;
    }
}
