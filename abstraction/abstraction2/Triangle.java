public class Triangle extends Shape {

    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {

        return 0.5 * dim1 * dim2;
    }

}
