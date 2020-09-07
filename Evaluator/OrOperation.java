package Evaluator;

public class OrOperation extends BinaryOperation{
    public OrOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    @Override
    protected int doOperation(int lhsval, int rhsval) throws DivideByZeroException {
        if(lhsval == 0 && rhsval == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    protected String toStringOperator() {
        return "||";
    }
}
