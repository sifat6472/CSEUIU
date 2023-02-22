class point2D{
    int x,y;
    public point2D(){
        x=y=1;
    }
    public point2D(int a){
        x = y = a;
    }
    public point2D(int x,int y){
        this.x = x;
        this.y = y;
    }

}
class point3D extends point2D{
    int z;
    public point3D(){
        super();
        z =1;
    }
    public point3D(int a){
        super(a);
        z = a;
    }
    public point3D(int x,int y,int z){
        super(x,y);
        this.z = z;
    }
}
public class pointD{
    public static void main(String[] args) {
        point3D p = new point3D();
        System.out.println(p.x +""+ p.y +""+p.y);
//       System.out.println(p.x);
//       System.out.println(p.y);
//       System.out.println(p.z);
    }

}









