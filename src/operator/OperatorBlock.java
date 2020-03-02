package operator;

public class OperatorBlock {

    private Operator operator;

    public OperatorBlock(Operator operator) {
        this.operator = operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public double execute(double a, double b) {
        return operator.execute(a, b);
    }
}
