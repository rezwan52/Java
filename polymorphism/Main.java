public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();

        s = new Rectangle(5, 10);
        System.out.println("Rectangle area: " + s.area());

        s = new Triangle(2, 10);
        System.out.println("Triangle area: " + s.area());

        s = new Circle(5);
        System.out.println("Circle area: " + s.area());
    }
}
