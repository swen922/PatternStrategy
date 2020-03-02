package operator;

public class OperatorAdd implements Operator {

    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}
