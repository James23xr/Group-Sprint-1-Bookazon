public class BookValidator {
    private double price;
    private String title;
    private String author;
    private int yearPublished;

    public BookValidator(double price, String title, String author, int yearPublished){
        this.price = price;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public boolean isPriceValid() {
        return price > 0;
    }

    public boolean isTitleValid() {
        return title != null && !title.isEmpty();
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

    public boolean isYearPublishedValid() {
        return yearPublished > 0;
    }

    public boolean isValid() {
        return isPriceValid() && isTitleValid() && isAuthorValid() && isYearPublishedValid();
    }
    public static void main(String[] args) {
        // Test 1: Valid book
        BookValidator validBook = new BookValidator(19.99, "Effective Java", "Joshua Bloch", 2008);
        System.out.println("Test 1: Valid book - " + validBook.isValid()); 

        // Test 2: Invalid price
        BookValidator invalidPriceBook = new BookValidator(-5.99, "Clean Code", "Robert C. Martin", 2008);
        System.out.println("Test 2: Invalid price - " + invalidPriceBook.isValid());  

        // Test 3: Empty title
        BookValidator emptyTitleBook = new BookValidator(29.99, "", "Robert C. Martin", 2008);
        System.out.println("Test 3: Empty title - " + emptyTitleBook.isValid());

        // Test 4: Null author
        BookValidator nullAuthorBook = new BookValidator(25.50, "Refactoring", null, 1999);
        System.out.println("Test 4: Null author - " + nullAuthorBook.isValid()); 

        // Test 5: Invalid yearPublished
        BookValidator invalidYearBook = new BookValidator(30.00, "Design Patterns", "Erich Gamma", -1994);
        System.out.println("Test 5: Invalid yearPublished - " + invalidYearBook.isValid());
    }
}