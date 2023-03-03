public class Fastfood extends Food{
    String Type,Flavour;
    public Fastfood(Double calories,Double fat,Double carb,String Type, String Flavour){
        super(calories,fat,carb);
        this.Flavour = Flavour;
        this.Type = Type;
    }
    void Fastfoodreview(){
        System.out.println("Inside the review method of Fastfood class");
    }

}
