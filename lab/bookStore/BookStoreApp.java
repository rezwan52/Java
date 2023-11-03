import java.util.Scanner;

import javax.swing.JOptionPane;

public class BookStoreApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String bookStoreName, bookTitle, author;
        int qunatity;

        bookStoreName = JOptionPane.showInputDialog("Enter book store name: ");
        BookStore bStore1 = new BookStore(bookStoreName);

        int indicator;
        bStore1.showMessage();
        indicator = scan.nextInt();

        while (indicator != 0) {
            if (indicator == 1) {
                bStore1.display();

            } else if (indicator == 2) {
                bookTitle = JOptionPane.showInputDialog("Enter Book Title: ");
                author = JOptionPane.showInputDialog("Enter author name: ");

                System.out.print("Enter book quantity: ");
                qunatity = scan.nextInt();

                bStore1.order(bookTitle, author, qunatity);

            } else if (indicator == 3) {

                bookTitle = JOptionPane.showInputDialog("Enter Book Title: ");
                author = JOptionPane.showInputDialog("Enter author name: ");

                System.out.print("Enter book quantity: ");
                qunatity = scan.nextInt();

                bStore1.sell(bookTitle, author, qunatity);

            }

            bStore1.showMessage();
            indicator = scan.nextInt();
        }
        scan.close();

    }
}
