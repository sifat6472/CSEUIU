public class Fifa {
    private int noOfGOals;
    private String venue;



    public Fifa(){
        System.out.println("Who will be winner ?");
    }

    public  Fifa (int noOfGOals, String venue){
            this();
            this.noOfGOals = noOfGOals;
            this.venue = venue;
    }

    @Override
    public String toString() {
        return "ArgentinaFans{" +
                "noOfGOals=" + noOfGOals +
                ", venue='" + venue + '\'' +
                '}' ;
    }
    public int getNoGoals(){
        return noOfGOals;
    }
}
