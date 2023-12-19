package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        User user = new User();
        user.setUserName("Adam");
        user.setEmail("adam@gmail.pl");
        user.setPassword("adam123!");

        UserDao userDao = new UserDao();
        User readUser = userDao.read(22);
        if (readUser != null) {
            System.out.println(readUser);
        } else {
            System.out.println(user.getId());
        }
    }
}
