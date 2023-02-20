import java.lang.Math;
public class Circle {
    private Point Center;
    private double Radius,Radius1;
    Circle(Point Center,double Radius,double Radius1){
        this.Center = Center;
        this.Radius = Radius;
        this.Radius1 = Radius1;
    }

    public void setCenter(Point center) {
        Center = center;
    }

    public Point getCenter() {
        return Center;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public void setRadius1(double radius1) {
        Radius1 = radius1;
    }

    public double getRadius1() {
        return Radius1;
    }

    static double area(double Radius){
        return 3.1416*Radius*Radius;
    }
    static double perimeter(double Radius){
        return 2*3.1416*Radius;
    }
    public boolean isReside(Point p){
        double distance = (Math.sqrt(Math.pow((this.Center.getX() - p.getX()), 2) + Math.pow((this.Center.getY()- p.getY()), 2)));
        if(distance + Radius1 <= Radius)
            return true;
        return false;
    }

    public  void main(String[] args) {
        Point center = new Point(5,6);
        Point p = new Point(1,3);
        Circle r = new Circle(p,15,12);
        System.out.println("Area of Circle"+area(15));
        System.out.println("Perimeter Of Circle" + perimeter(15));
        System.out.println("Is this Circle inside another Circle?"+ r.isReside(p));

    }

}
