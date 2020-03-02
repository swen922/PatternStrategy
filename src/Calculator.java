import operator.*;

public class Calculator {

    private OperatorBlock block;

    public Calculator() {
        this.block = new OperatorBlock(new OperatorAdd());
    }

    public void operate(OperatorType type, double a, double b) {

        StringBuilder sb = new StringBuilder(type.toString());

        switch (type) {
            case ADD:
                block.setOperator(new OperatorAdd());
                sb.append(a).append(" + ").append(b).append(" = ");
                break;
            case SUBSTRACT:
                block.setOperator(new OperatorSubstract());
                sb.append(a).append(" - ").append(b).append(" = ");
                break;
            case MULTIPLY:
                block.setOperator(new OperatorMultiply());
                sb.append(a).append(" * ").append(b).append(" = ");
                break;
            case DIVIDE:
                block.setOperator(new OperatorDivision());
                sb.append(a).append(" / ").append(b).append(" = ");
                break;
            default :
                block.setOperator(new OperatorAdd());
                sb.append(a).append(" + ").append(b).append(" = ");
                break;
        }
        sb.append(block.execute(a,b));
        System.out.println(sb.toString());
    }
}
