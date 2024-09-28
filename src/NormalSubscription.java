public class NormalSubscription implements Subscription {

    public double discount = 0.00;
    public double multiplier = 1;

    public NormalSubscription() {
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }

    @Override
    public double getPrice(double fullPrice) {
        return fullPrice;
    }
}