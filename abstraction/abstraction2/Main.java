public class Main {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(5);

        System.out.println("Area of circle: " + s.area());

        s = new Triangle(5, 10);
        System.out.println("Area of triangle: " + s.area());

        s = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + s.area());

    }
}
