class practiceA{
    int i,j;
    practiceA(int i, int j){
        this.i = i;
        this.j = j;
    }
    void showi(){
        System.out.println(i);
    }
    void showj(){
        System.out.println(j);
    }
}
class practiceB extends practiceA {
    int k;
    public practiceB(int i,int j,int k){
//        this.i = i;
//        this.j = j;
        super(i,j);//same as previous line
        this.k = k;
    }
    void showk(){
        System.out.println(k);
    }

}
class A{
    int i,j;
    void showI(){
        System.out.println("i in A");
    }
}
class B extends A{
    int k;
    void showI(){
        System.out.println("i in B");
    }
}
public class practice{
    public static void main(String[] args) {
        practiceB b = new practiceB(1,2,3);
        b.showi();
        b.showj();
        b.showk();

        A be = new B();
        be.showI();
    }

}
