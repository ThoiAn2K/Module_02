public class UserController {
    public UserStorage userStorage;

public UserController(UserStorage userStorage){
    this.userStorage = userStorage;
}
public void storeUser(User user){
    userStorage.store(user);
}
}
