package exception;

class InvalidAgeException extends Exception {

}

class Registration {
    void register(int age) {
        if (age < 18) {
            try {
                throw new InvalidAgeException();
            } catch (InvalidAgeException e) {
                System.out.println("User is minor");
            }
        } else {
            System.out.println("User registered... Please follow the instructions.");
        }
    }
}

public class excp1 {
    public static void main(String[] args) {
        Registration user1 = new Registration();
        user1.register(40);
    }
}

