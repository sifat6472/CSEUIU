

public class Homemade extends Food {
    Double Protein;

    @Override
    void description() {

    }

    public Homemade(Double calories, Double fat, Double carb, Double Protein) {
        super(calories, fat, carb);
        this.Protein = Protein;
    }

    void Homemadereview(){
        System.out.println("Inside the review method of Homemade class");
    }

}
