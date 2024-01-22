package calculator;

import complexoperations.ComplexOperation;
import operations.Operation;
import complexoperations.ComplexNumber;

public class Calculator {
    private Operation operation;
    private ComplexOperation complexOperation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public Calculator(ComplexOperation complexOperation) {
        this.complexOperation = complexOperation;
    }

    public double performOperation(double operand1, double operand2) {
        return operation.calculate(operand1, operand2);
    }

    public ComplexNumber performComplexOperation(ComplexNumber operand1, ComplexNumber operand2) {
        return complexOperation.calculate(operand1, operand2);
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public void setComplexOperation(ComplexOperation complexOperation) {
        this.complexOperation = complexOperation;
    }
}