public class Main {
    public static void main(String[] args) {
        User user = new User("john", "password");
        UserStorage xmlStorage = new XMLStorage();
        UserController userController = new UserController(xmlStorage);
        userController.storeUser(user);


        System.out.println();


        User user1 = new User("john", "password");
        UserStorage mySQLStorage = new MySQLStorage();
        UserController userController1 = new UserController(mySQLStorage);
        userController1.storeUser(user1);


    }
}
