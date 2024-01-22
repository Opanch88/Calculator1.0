import calculator.CalculatorApp;
import input.InputReader;
import output.ResultPrinter;

public class Main {
    public static void main(String[] args) {
        try (InputReader inputReader = new InputReader()) {
            ResultPrinter resultPrinter = new ResultPrinter();
            CalculatorApp calculatorApp = new CalculatorApp(inputReader, resultPrinter);
            calculatorApp.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}