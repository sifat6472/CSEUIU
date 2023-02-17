import java.lang.Math;
public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public boolean IsPointInside( Point p){

        if(Math.sqrt(Math.pow((this.center.getX() - p.getX()), 2) + Math.pow((this.center.getY()- p.getY()), 2))<getRadius())
            return true;
        return false;
    }

    public static void main(String[] args) {
        Point center = new Point(8,8);
        Circle c = new Circle(center,5);
        Point p =new Point(45,55);
        System.out.println(c.IsPointInside(p));
    }
}



