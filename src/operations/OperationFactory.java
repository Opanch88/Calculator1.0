package operations;

public class OperationFactory {
    public static Operation createOperation(int choice) {
        return switch (choice) {
            case 1 -> new Addition();
            case 2 -> new Subtraction();
            case 3 -> new Multiplication();
            case 4 -> new Division();
            default -> throw new IllegalArgumentException("Invalid operation choice");
        };
    }
}