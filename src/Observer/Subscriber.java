package Observer;

public class Subscriber {

    private String news;
    public void update(String news) {
        this.news = news;
        display();
    }
    public void display() {
        System.out.println(this.news);
    }

}
