package Evaluator;

public class IntConstant implements IntExpression{

    private int value;

    public IntConstant(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
    public String toString() {
        return Integer.toString(value);
    }
}
