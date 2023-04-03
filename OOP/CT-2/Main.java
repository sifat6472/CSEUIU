package CT;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        System.out.println("Area of Rectangle " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle "+rectangle.getPerimeter());
        Square square = new Square(3);
        System.out.println("Area of Square " +square.getArea());
        System.out.println("Perimeter of Square " + square.getPerimeter());
        Circle circle = new Circle(3);
        System.out.println("Area of Circle " + circle.getArea());
        System.out.println("Perimeter of Circle " + circle.getPerimeter());
    }
}
