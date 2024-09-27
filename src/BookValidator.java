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
}