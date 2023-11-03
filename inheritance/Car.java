public class Car extends Vehicle {
    String name;

    Car(String name, String color, double weight) {
        super(color, weight);
        this.name = name;
    }

    @Override
    void display() {
        System.out.println("Car Name: " + name);
        super.display();
    }
}
