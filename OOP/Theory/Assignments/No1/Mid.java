public class Mid {
    public static void main(String[] args) {
        ArgentinaFans arg = new ArgentinaFans(5,"Sher-E-Bangla Stadium",3);
        System.out.println("Argentina Will Win");
        BrazilFans bra = new BrazilFans(6,"Sher-E-Bangla Stadium",2);
        System.out.println("Brazil Will Win");
        System.out.println(arg);
        System.out.println(bra);
       if(arg.getNoGoals() > bra.getNoGoals())
           arg.incrementWorldCups();
       else
           bra.incrementWorldCups();
        System.out.println(arg);
        System.out.println(bra);
    }
}
