public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
        this.isPaperback = isPaperback;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
    }

    public boolean isValid(){
        BookValidator validator = new BookValidator(price, title, author, yearPublished);
        return validator.isValid();
    }
}