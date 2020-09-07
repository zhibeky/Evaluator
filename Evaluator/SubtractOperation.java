package Evaluator;

public class SubtractOperation extends BinaryOperation{
    public SubtractOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    @Override
    protected int doOperation(int lhsval, int rhsval) {
        return lhsval - rhsval;
    }

    @Override
    protected String toStringOperator() {
        return "-";
    }
}
