package Prototype;

public class Book implements Cloneable {
    private String title;
    private int cost;
    private int pages;
    public Book(String title, int cost, int pages) {
        this.title = title;
        this.cost = cost;
        this.pages = pages;
    }

    public Book clone(int newCost, String newTitle, int newPages) {
        return new Book(
                newTitle == null ? this.title : newTitle,
                newCost == -1 ? this.cost : newCost,
                newPages == -1 ? this.pages : newPages
        );
    }

    public Book clone() {
        return clone(-1, null, -1);
    }

    @Override
    public java.lang.String toString() {
        return "Book{" +
                "title=" + title +
                ", cost=" + cost +
                ", pages=" + pages +
                '}';
    }

    public static void main(String[] args) {
        Book kniga = new Book("Maan", 1000, 123);
        Book knijka = kniga.clone();
        System.out.println(knijka.toString());
    }
}
