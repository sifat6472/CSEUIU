package Solve8;

public class PaperBackBook extends Book{
    @Override
    void description() {
        System.out.println("Paperback Books are good for your eyes");
    }
    void putPageMarker(int pageNo){
        System.out.println("Page marker was " + "put on page no : " + pageNo);
    }
}
