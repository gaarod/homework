package subtask1;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Validator.validate("qweqwed","qweqeqwd","q1weqeqwd"));
        }
        catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }
        catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }

    }
}