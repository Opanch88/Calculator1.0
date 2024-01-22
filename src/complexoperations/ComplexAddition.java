package complexoperations;

public class ComplexAddition implements ComplexOperation {
    @Override
    public ComplexNumber calculate(ComplexNumber operand1, ComplexNumber operand2) {
        double realResult = operand1.getReal() + operand2.getReal();
        double imaginaryResult = operand1.getImaginary() + operand2.getImaginary();
        return new ComplexNumber(realResult, imaginaryResult);
    }
}