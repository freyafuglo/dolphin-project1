public enum Subscription { // EJERSKAB: DITTE & MATHIAS
    JUNIOR(1000),
    SENIOR(1600),
    PENSIONIST(SENIOR.getSubscriptionPrice() * 0.75),
    PASSIV(500);

    public final double subscriptionPrice;

    Subscription(double subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public double getSubscriptionPrice(){
        return subscriptionPrice;
    }
}
