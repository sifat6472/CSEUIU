package CT;

public class Rectangle {
    double width,height;
    Rectangle(){}
    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double  getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return (2*(height+width));
    }

}
