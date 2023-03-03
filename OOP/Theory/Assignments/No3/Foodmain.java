public class Foodmain {
    public static void main(String[] args) {
        Food f1 = new Homemade(10.0,9.0,7.5,12.0);
        Food f2 = new Fastfood(12.0,13.0,12.5,"Pizza","Pepperoni");
        ((Homemade)f1).Homemadereview();
        ((Fastfood)f2).Fastfoodreview();
    }
}
