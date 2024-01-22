package complexoperations;

public class ComplexDivision implements ComplexOperation {
    @Override
    public ComplexNumber calculate(ComplexNumber operand1, ComplexNumber operand2) {
        double denominator = operand2.getReal() * operand2.getReal() + operand2.getImaginary() * operand2.getImaginary();
        double realResult = (operand1.getReal() * operand2.getReal() + operand1.getImaginary() * operand2.getImaginary()) / denominator;
        double imaginaryResult = (operand1.getImaginary() * operand2.getReal() - operand1.getReal() * operand2.getImaginary()) / denominator;
        return new ComplexNumber(realResult, imaginaryResult);
    }
}