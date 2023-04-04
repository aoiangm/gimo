package java0321;

public class Book {
    String title;
    String author;
    void show() {
        System.out.println(title + " " + author);
    }
    public Book() {
        this("", "");
    }
    public Book(String title) {
        this(title, "작가미상");
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        Book emptyBook = new Book( "자바를배우자");
        emptyBook.show();
    }
}
