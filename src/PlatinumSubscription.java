public class PlatinumSubscription implements Subscription {

    public double discount = 0.10;
    public double multiplier = 0.90;

    public PlatinumSubscription() {
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