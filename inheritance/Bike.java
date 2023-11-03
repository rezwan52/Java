public class Bike extends Vehicle {
    String name;

    Bike(String name, String color, double weight) {
        super(color, weight);
        this.name = name;
    }

    @Override
    void display() {
        System.out.println("Bike name: " + name);
        super.display();
    }
}
