
public class Product {
    String name, id, category;
    double price;

    Product(String name, String id, String category, double price) {
        this.name = name;
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice(double discountPercentage) {

        double discountedprice = price;

        // if (discountPercentage >= 10 && discountPercentage <= 30) {
        discountedprice = price - ((price * discountPercentage) / 100);
        // }

        return discountedprice;
    }

    void display() {
        System.out.println("Product id: " + id + ", Product name: " + name + ", Product category: " + category
                + ", Product price: " + price);
    }

}
