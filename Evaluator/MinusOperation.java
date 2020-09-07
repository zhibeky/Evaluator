package Evaluator;

public class MinusOperation extends UnaryOperation{

    public MinusOperation(int val) {
        super(val);
    }

    @Override
    protected int doOperation(int val) {
        return val*(-1);
    }

    @Override
    protected String toStringOperator() {
        return "-";

    }

}
