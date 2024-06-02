package subtask1;

public class Validator {
    public static boolean validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Invalid login");
        }

        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }

        return true;
    }
}
