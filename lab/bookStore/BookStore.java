import java.util.ArrayList;

public class BookStore {
    String name;

    BookStore(String name) {
        this.name = name;
    }

    ArrayList<Book> books = new ArrayList<>();

    public boolean sell(String title, String author, int qunatity) {
        Book foundedBook = findBook(title, author);

        if (foundedBook == null) {
            return false;
        } else {
            for (Book book : books) {
                if (book.bookTitle.equals(title) && book.bookAuthor.equals(author)) {
                    if (book.numOfCopies >= qunatity) {
                        book.numOfCopies = book.numOfCopies - qunatity;

                    } else {
                        System.out.println("Insufficient Book");
                    }

                }
            }
            return true;

        }

    }

    public void order(
            String title, String author, int qunatity) {

        Book foundBook = findBook(title, author);
        if (foundBook == null) {

            Book newBook = new Book(title, author, qunatity);
            books.add(newBook);

        } else {

            for (Book book : books) {
                if (book.bookTitle.equals(title) && book.bookAuthor.equals(author)) {

                    book.numOfCopies = book.numOfCopies + qunatity;

                }
            }

        }

    }

    public void display() {
        if (books.size() == 0) {
            System.out.println("No Books in " + name);
        } else {
            for (Book book : books) {
                book.display();
            }
        }

    }

    public Book findBook(String title, String author) {
        for (Book book : books) {
            if (book.bookTitle.equals(title) && book.bookAuthor.equals(author)) {

                return book;

            }
        }
        return null;
    }

    public void showMessage() {
        System.out.println();
        System.out.println("Enter 1 to display all books.");
        System.out.println("Enter 2 order books.");
        System.out.println("Enter 3 sell books.");
        System.out.println("Enter 0 to exit the program. ");

    }

}
