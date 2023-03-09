package Solve8;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new PaperBackBook();

        book1.description();
        book2.description();
        ((PaperBackBook)book2).putPageMarker(5);
    }

}
