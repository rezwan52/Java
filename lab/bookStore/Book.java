
public class Book {
    String bookTitle, bookAuthor;
    int numOfCopies;

    Book(String bookTitle, String bookAuthor, int numOfCopies) {

        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.numOfCopies = numOfCopies;
    }

    public void display() {
        System.out.println("Title: " + bookTitle + " - Author: " + bookAuthor + " - Quantity: " + numOfCopies);
    }
}