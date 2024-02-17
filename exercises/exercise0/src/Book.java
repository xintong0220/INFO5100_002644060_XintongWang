public class Book {
    private String title;
    private String author;
    private int numberOfPage;
    private float price;
    private String language;
    private String publisher;
    private String color;
    private String id;

    public Book(String title, String author, int numberOfPage, float price, String language, String publisher, String color, String id) {
        this.title = title;
        this.author = author;
        this.numberOfPage = numberOfPage;
        this.price = price;
        this.language = language;
        this.publisher = publisher;
        this.color = color;
        this.id = id;
        System.out.println("This book is called: " + id);
    }

    public void openBook() {
        System.out.println("People can open book.");
    }

    public void closeBook() {
        System.out.println("People can close book.");
    }

    public void readBook() {
        System.out.println("People can read book.");
    }
}
