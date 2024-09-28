public class SilverSubscription implements Subscription {

    public double discount = 0.05;
    public double multiplier = 0.95;

    public SilverSubscription() {
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