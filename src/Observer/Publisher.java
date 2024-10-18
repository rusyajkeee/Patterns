package Observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private List<Subscriber> subs = new ArrayList<>();
    private String news;



    public void subscribe(Subscriber s) {
        subs.add(s);
    };
    public void unSubscribe(Subscriber s) {
        subs.remove(s);
    };
    public void myNotify() {
        for (int i = 0; i < subs.size(); i++) this.subs.get(i).update(news);
    }

    public void setNews(String newNews) {
        this.news = newNews;
        myNotify();
    }

}
