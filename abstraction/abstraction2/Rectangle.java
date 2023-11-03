public class Rectangle extends Shape {

    Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}
