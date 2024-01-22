package calculator;

import input.InputReader;
import output.ResultPrinter;
import operations.Operation;
import operations.OperationFactory;
import complexoperations.ComplexNumber;
import complexoperations.ComplexOperationFactory;
import complexoperations.ComplexOperation;

public class CalculatorApp {
    private final InputReader inputReader;
    private final ResultPrinter resultPrinter;

    public CalculatorApp(InputReader inputReader, ResultPrinter resultPrinter) {
        this.inputReader = inputReader;
        this.resultPrinter = resultPrinter;
    }

    public void run() {
        int operationType = inputReader.getOperationType();
        if (operationType == 1) {
            System.out.println("Choose regular operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            int choice = inputReader.getOperationChoice();

            double operand1 = inputReader.getOperand("Enter the first number: ");
            double operand2 = inputReader.getOperand("Enter the second number: ");

            Operation operation = OperationFactory.createOperation(choice);
            Calculator calculator = new Calculator(operation);

            double result = calculator.performOperation(operand1, operand2);
            resultPrinter.displayResult(result);
        } else {
            System.out.println("Invalid operation type choice");
        }

        if (operationType == 2) {
            System.out.println("Choose complex operation:");
            System.out.println("5. Complex Addition");
            System.out.println("6. Complex Subtraction");
            System.out.println("7. Complex Multiplication");
            System.out.println("8. Complex Division");
            int choice = inputReader.getComplexOperationChoice();

            double realPart1 = inputReader.getOperand("Enter the real part of the first number: ");
            double imaginaryPart1 = inputReader.getOperand("Enter the imaginary part of the first number: ");
            double realPart2 = inputReader.getOperand("Enter the real part of the second number: ");
            double imaginaryPart2 = inputReader.getOperand("Enter the imaginary part of the second number: ");

            ComplexNumber operand1 = new ComplexNumber(realPart1, imaginaryPart1);
            ComplexNumber operand2 = new ComplexNumber(realPart2, imaginaryPart2);

            ComplexOperation complexOperation = ComplexOperationFactory.createComplexOperation(choice);
            Calculator calculator = new Calculator(complexOperation);

            ComplexNumber result = calculator.performComplexOperation(operand1, operand2);
            System.out.println("Result: " + result.getReal() + " + " + result.getImaginary() + "i");
        }
    }
}

