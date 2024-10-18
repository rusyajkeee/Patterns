package Observer;

public class Main {
    public static void main(String[] args) {
        Publisher rassylka = new Publisher();
        Subscriber s = new Subscriber();
        Subscriber я = new Subscriber();

        rassylka.subscribe(s);
        rassylka.subscribe(я);
        rassylka.setNews("watson joins GG");
        rassylka.unSubscribe(я);
        rassylka.setNews("Dora released new album");
    }
}
