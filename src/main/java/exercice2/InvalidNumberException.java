package exercice2;

public class InvalidNumberException extends Exception {
    private int InvalidNumber;

    public InvalidNumberException(int n) {

        InvalidNumber = n;
    }
}
