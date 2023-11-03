// Shark Class

public class Shark {

    String species, color;
    double weight;

    Shark(String species, String color, double weight) {
        this.species = species;
        this.color = color;
        this.weight = weight;
    }

    public void hunt(String prey, double pWgt) {
        System.out.println(species + " like to hunt " + prey);

        weight = weight + pWgt;
    }

    public double getWeight() {
        return weight;
    }

    public void display() {
        System.out.println("Species: " + species + " Color: " + color + " Weight: " + weight);
    }

}