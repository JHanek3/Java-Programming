public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return String.format("%s, %d pages, %d", this.title, this.pages, this.year);
    }
}
