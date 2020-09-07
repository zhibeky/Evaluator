package Evaluator;

public abstract class UnaryOperation implements IntExpression{

    private int val;

    public UnaryOperation(int val) {
        this.val = val;
    }
    abstract protected int doOperation(int val);

    abstract protected String toStringOperator();

    public int getValue() {
        return doOperation(val);
    }

    public String toString() {
        return toStringOperator() + val;

    }
}
