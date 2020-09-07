package Evaluator;

public class DivideOperation extends BinaryOperation {
    public DivideOperation(IntExpression lhs, IntExpression rhs) {
        super(lhs, rhs);
    }

    @Override
    protected int doOperation(int lhsval, int rhsval) throws DivideByZeroException {
        if(rhsval == 0) throw new DivideByZeroException();
        return lhsval / rhsval;
    }

    @Override
    protected String toStringOperator() {
        return "/";
    }
}
