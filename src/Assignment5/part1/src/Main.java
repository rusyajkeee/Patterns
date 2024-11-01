import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView(null);
        view.setPresenter(new DataPresenter(view, model));
        String data;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 for new, 2 for show, 3 for exit");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter new data");
                    data = sc.nextLine();
                    view.setData(data);
                    break;
                case 2:
                    view.displayData();
                    break;
                case 3:
                    sc.close();
                    break;
                default:
                    System.out.println("invalid option");
                    break;
            }
        }
    }
}