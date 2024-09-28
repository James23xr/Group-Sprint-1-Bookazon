public class GoldSubscription implements Subscription {

    public double discount = 0.15;
    public double multiplier = 0.85; // original code was wrong

    public GoldSubscription() {
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public double getPrice(double fullPrice) {
        return this.multiplier * fullPrice;
    }
}
