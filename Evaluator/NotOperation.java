package Evaluator;

public class NotOperation extends UnaryOperation {

    public NotOperation(int val) {
        super(val);
    }

    @Override
    protected int doOperation(int val) {
        if(val == 0)
            return 1;
        else
            return 0;
    }

    @Override
    protected String toStringOperator() {
        return "!";
    }

}
