public enum Subscription {
    JUNIOR(1000),
    SENIOR(1600),
    PENSIONIST(SENIOR.getSubscription() * 0.75),
    PASSIV(500);

    public final double subscription;

    Subscription(double subscription) {
        this.subscription = subscription;
    }

    public double getSubscription(){
        return subscription;
    }
}
