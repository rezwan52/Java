import java.util.*;
import javax.swing.JOptionPane;

public class UapBazar {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>();
        Scanner scan = new Scanner(System.in);
        int indicator;

        System.out.println("Enter 1 to add new product");
        System.out.println("Enter 2 to update product");
        System.out.println("Enter 3 to get discounted price of product");
        System.out.println("Enter 4 to show single product");
        System.out.println("Enter 5 to show all products");
        System.out.println("Enter 0 to exit.");

        indicator = scan.nextInt();

        while (indicator != 0) {

            if (indicator == 1) {

                String name, id, category;
                double price;
                name = JOptionPane.showInputDialog("Enter product name");

                id = JOptionPane.showInputDialog("Enter product ID");
                category = JOptionPane.showInputDialog("Enter product category");
                System.out.println("Enter product price: ");
                price = scan.nextDouble();

                Product prod1 = new Product(name, id, category, price);

                products.add(prod1);

            } else if (indicator == 2) {

                String prodID = JOptionPane.showInputDialog("Enter product ID to update: ");
                double price;
                System.out.println("Enter new price: ");
                price = scan.nextDouble();

                for (Product prod : products) {
                    if (prod.id.equals(prodID)) {
                        prod.updatePrice(price);
                    }
                }

            } else if (indicator == 3) {

                String prodID = JOptionPane.showInputDialog("Enter product ID to get discouted price: ");
                double percentage;

                System.out.println("Enter percentage: ");
                percentage = scan.nextDouble();

                for (Product prod : products) {
                    if (prod.id.equals(prodID)) {
                        System.out.println("Discounted price: " + prod.getDiscountedPrice(percentage));
                    }
                }

            } else if (indicator == 4) {
                String prodID = JOptionPane.showInputDialog("Enter product ID to see specific product info: ");

                for (Product prod : products) {
                    if (prod.id.equals(prodID)) {
                        prod.display();
                    }
                }

            } else if (indicator == 5) {

                for (Product prod : products) {

                    prod.display();
                    System.out.println();

                }

            }

            System.out.println("Enter 1 to add new product");
            System.out.println("Enter 2 to update product");
            System.out.println("Enter 3 to get discounted price of product");
            System.out.println("Enter 4 to show single product");
            System.out.println("Enter 5 to show all products");
            System.out.println("Enter 0 to exit.");

            indicator = scan.nextInt();
        }

    }

}
