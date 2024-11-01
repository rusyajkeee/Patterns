import java.util.List;
import java.util.Scanner;

public class UserView {
    private UserViewModel uvm;
    public UserView(UserViewModel uvm) {
        this.uvm = uvm;
    }
    public void showMenu() {
        System.out.println("1. add user");
        System.out.println("2. show users");
        System.out.println("3. exit");
    }


    public void run() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            showMenu();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = sc.nextLine();
                    uvm.addUser(name);
                    System.out.println("User added!");
                    break;
                case 2:
                    uvm.getUserNames();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }


}