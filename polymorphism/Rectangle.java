public class Rectangle extends Shape {
    double x, y;

    Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        return x * y;
    }
}
