package Evaluator;

public class AndOperation extends BinaryOperation {
    public AndOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    @Override
    protected int doOperation(int lhsval, int rhsval) {
        if(lhsval == 0 || rhsval == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    protected String toStringOperator() {
        return "&";
    }
}
