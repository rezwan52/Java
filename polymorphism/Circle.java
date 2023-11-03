public class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;

    }

    @Override
    double area() {
        return 3.1416 * r * r;
    }

}
