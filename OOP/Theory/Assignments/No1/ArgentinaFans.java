public class ArgentinaFans extends Fifa {
    private int havingWorldCups;



    public  ArgentinaFans(int noOfGOals, String venue, int havingWorldCups){
        super(noOfGOals,venue);
        this.havingWorldCups = havingWorldCups;

    }
    public String toString(){
        return "ArgentinaFans->[" + super.toString() +"]" + "HavingWorldCups :" + havingWorldCups;
    }
    void incrementWorldCups(){
            this.havingWorldCups++;
    }


}
