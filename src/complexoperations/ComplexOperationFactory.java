package complexoperations;

public class ComplexOperationFactory {
    public static ComplexOperation createComplexOperation(int choice) {
        return switch (choice) {
            case 5 -> new ComplexAddition();
            case 6 -> new ComplexSubtraction();
            case 7 -> new ComplexMultiplication();
            case 8 -> new ComplexDivision();
            default -> throw new IllegalArgumentException("Invalid complex operation choice");
        };
    }
}
