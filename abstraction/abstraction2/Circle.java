public class Circle extends Shape {

    Circle(double r) {
        super(r, r);

    }

    @Override
    double area() {
        return Math.PI * dim1 * dim2;
    }
}
