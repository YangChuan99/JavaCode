class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}

class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}


public class Test0511 {

    private static String userName = "admin";
    private static String password = "123456";

    public static void main(String[] args) {
        try {
            login("admin", "123456");
        } catch (UserException userError) {
            userError.printStackTrace();
        } catch (PasswordException passwordError) {
            passwordError.printStackTrace();
        }
    }
    public static void login(String userName, String password) throws UserException,
            PasswordException {
        if (!Test0511.userName.equals(userName)) {
            throw new UserException("用户名错误");
        }
        if (!Test0511.password.equals(password)) {
            throw new PasswordException("密码错误");
        }
        System.out.println("登陆成功");
    }
}
