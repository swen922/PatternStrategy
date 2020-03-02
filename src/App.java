import operator.OperatorAdd;
import operator.OperatorType;

/** Стратегия, также известен как: Strategy */

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.operate(OperatorType.ADD, 10, 5);
        calculator.operate(OperatorType.SUBSTRACT, 10, 20);
        calculator.operate(OperatorType.MULTIPLY, 10, 30);
        calculator.operate(OperatorType.DIVIDE, 10, 50);
    }
}
