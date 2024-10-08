import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(Cart cart, Subscription subType) {
        this.items = cart.getItems();
        this.orderPrice = calculateOrderPrice(subType);
    }
    public void setShippingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.shippingAddress = new Address(line1, line2, city, state, zip, country);
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        this.billingAddress = new Address(line1, line2, city, state, zip, country);
    }


    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println(
                "Shipping Address: " + this.shippingAddress.getStreetAddress() + ", " + this.shippingAddress.getApartmentNumber() + ", " + this.shippingAddress.getCity()
                        + ", " + this.shippingAddress.getState() + ", " + this.shippingAddress.getZipCode() + ", " + this.shippingAddress.getCountry());
        System.out.println(
                "Billing Address: " + this.billingAddress.getStreetAddress() + ", " + this.billingAddress.getApartmentNumber() + ", " + this.billingAddress.getCity()
                        + ", " + this.billingAddress.getState() + ", " + this.billingAddress.getZipCode() + ", " + this.billingAddress.getCountry());
        System.out.println("Order Price: $" + orderPrice);
    }

    public double calculateOrderPrice(Subscription subType) {

        double totalPrice = 0.0;

        for (CartItem item : items) {

            totalPrice += item.getTotalPrice();

        }

        // get the discounted price using the discount
        return subType.getPrice(totalPrice);

    }
}
