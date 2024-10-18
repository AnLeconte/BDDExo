package Exo1;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private final Map<String, User> users = new HashMap<>();

    public boolean registerUser(String email, String username, String password) {
        if (users.containsKey(username)) {
            return false; // Username already exists
        }
        User user = new User(email, username, password);
        users.put(username, user);
        return true;
    }

    public boolean isUserRegistered(String username) {
        return users.containsKey(username);
    }

    public boolean loginUser(String username, String password) {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

}

