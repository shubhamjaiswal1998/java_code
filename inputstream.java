class CustomException extends Exception {
    CustomException(String message) {
        super(message);
        System.out.println("1# " + message);

    }
}
public class inputstream {
    // Method that may throw the custom exception
    static void validateInput(int value) throws CustomException {
        if (value < 0) {

            throw new CustomException("2 Input cannot be negative");
        }
        // If input is valid, proceed with processing
        System.out.println("Input is valid: " + value);
    }
    public static void main(String[] args) {
        try {
            validateInput(-5);
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }
}
