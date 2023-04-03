package CT;

public class Circle extends Square {
    double radius;
    Circle(double radius){
        super(radius);
    }

    @Override
    public double getArea() {
        return 3.1416*super.getArea();
    }

    @Override
    public double getPerimeter() {
        return 3.1416 * super.getPerimeter()/2;
    }
}
