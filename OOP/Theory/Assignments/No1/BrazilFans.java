public class BrazilFans extends Fifa {
    private int havingWorldCups;

    public  BrazilFans(int noOfGOals, String venue,int havingWorldCups){
        super(noOfGOals,venue);
        this.havingWorldCups = havingWorldCups;
    }
    public String toString(){
        return "BrazilFans ->["+super.toString()+"]" + "Having WorldCUps : " + havingWorldCups;
    }
    void incrementWorldCups(){
        this.havingWorldCups++;
    }


}
