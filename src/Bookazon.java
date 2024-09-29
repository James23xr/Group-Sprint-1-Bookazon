import java.util.ArrayList;

public class Bookazon {

    private ArrayList<Item> items;
    private ArrayList<User> users;

    public Bookazon() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewitems() {
        for (Item item : items) {
            item.printDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    // public void updateBookDetails(Book book, String newTitle, String newAuthor,
    // int newYearPublished, double newPrice,
    // boolean isPaperback) {
    // book.setTitle(newTitle);
    // book.setAuthor(newAuthor);
    // book.setYearPublished(newYearPublished);
    // book.setPrice(newPrice);
    // book.setPaperback(isPaperback);
    // } this makes things DIFFICULT and probably shouldn't be here. its not used in
    // main

    public void updateRole(User user, Subscription type) {
        user.setSubscription(type);
    }

    public static void main(String[] args) {

        Bookazon bookazon = new Bookazon();

        // create items
        bookazon.addItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.addItem(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
        bookazon.addItem(new Book("1984", "George Orwell", 1949, 8.99, true));
        bookazon.addItem(new Ebook("A Clockwork Orange", "Anthony Burgess", 1962, 9.99));

        // create subscription types
        Subscription normal = new NormalSubscription();
        Subscription gold = new GoldSubscription();
        // Subscription platinum = new PlatinumSubscription();
        // Subscription silver = new SilverSubscription();

        // create users
        bookazon.addUser(new User("Alice", normal));
        bookazon.addUser(new User("Bob", gold));

        // add items to cart
        bookazon.users.get(0).addToCart(bookazon.items.get(0), 1);
        bookazon.users.get(0).addToCart(bookazon.items.get(1), 2);
        // bookazon.users.get(0).addToCart(bookazon.items.get(3), 2);

        // view cart
        bookazon.users.get(0).viewCart();

        // set shipping address and billing address
        Address shippingAddress = new Address("123 Main St", "", "Springfield", "IL", "62701", "USA");
        Address billingAddress = new Address("456 Elm St", "", "Springfield", "IL", "62702", "USA");
        bookazon.users.get(0).setBillingAddress(shippingAddress);
        bookazon.users.get(0).setShippingAddress(billingAddress);

        // checkout
        bookazon.users.get(0).checkout();

        // view order details
        bookazon.users.get(0).viewOrders();

    }
}
