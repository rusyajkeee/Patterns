import java.util.ArrayList;
import java.util.List;

public class UserViewModel {
    // add user calls UserModel
    // get user Names calls UserModel to create Arraylist of users
    private List<UserModel> users;
    public UserViewModel() {
        users = new ArrayList<>();
    }
    public void addUser(String name) {
        UserModel user = new UserModel(name);
        users.add(user);
    }

    public void getUserNames() {
        for(UserModel user : users) {
            System.out.println(user.getName());
        }
    }

}