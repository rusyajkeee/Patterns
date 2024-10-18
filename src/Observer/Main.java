package Observer;

import java.util.Scanner;

public class Main {
    //viperr crew
    //RRuslan Matveyev
    //Yerrassyl Zekebayev
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Publisher rassylka = new Publisher();

        Subscriber z = new Subscriber();
        rassylka.subscribe(z);
        Subscriber s = new Subscriber();
        System.out.println("do you want to subscribe? 1 = yes, 2 = no ");
        int usl = sc.nextInt();
        sc.nextLine();

        if(usl == 1) {rassylka.subscribe(s);};
        System.out.println("Set news:");
        String news = sc.nextLine();
        rassylka.setNews(news);


        rassylka.unSubscribe(z);
        System.out.println("Set news:");
        String newa = sc.nextLine();
        rassylka.setNews(newa);
    }
}
