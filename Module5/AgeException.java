package Module5;

public class AgeException extends Exception {
    AgeException(String message){
        super(message);
    }
    public static void main(String[] args) throws AgeException {
        int age = 20;
        if (age < 18) {
            throw new AgeException("Age must be 18 or above");
        }
        System.out.println("Eligible");

    }
}
