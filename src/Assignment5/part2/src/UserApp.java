public class UserApp {
    public static void main(String[] args) {
        UserView uv = new UserView(new UserViewModel());
        uv.run();

    }
}