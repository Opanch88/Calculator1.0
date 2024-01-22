package complexoperations;

public class ComplexMultiplication implements ComplexOperation {
    @Override
    public ComplexNumber calculate(ComplexNumber operand1, ComplexNumber operand2) {
        double realResult = operand1.getReal() * operand2.getReal() - operand1.getImaginary() * operand2.getImaginary();
        double imaginaryResult = operand1.getReal() * operand2.getImaginary() + operand1.getImaginary() * operand2.getReal();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}