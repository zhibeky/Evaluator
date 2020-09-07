package Evaluator;

public class Main {

    public static void main(String[] args) throws DivideByZeroException {

        IntExpression expr =
                new AddOperation(
                        new IntConstant(5),
                        new MultiplyOperation(
                                new IntConstant(-8),
                                new SubtractOperation(
                                        new IntConstant(10),
                                        new IntConstant(8))));

        System.out.println("result1: " + expr);


        try {
            IntExpression ex1 =
                    new DivideOperation(
                            new IntConstant(10),
                            new IntConstant(0));
            System.out.println("result2: " + ex1.getValue());
        } catch (Exception ex) {
            System.out.println("result2: " + ex.getMessage());
        }


        IntExpression ex2 =
                new TernaryOperation(new IntConstant(0), new IntConstant(5), new IntConstant(1));
        System.out.println("result3: " + ex2);


        IntExpression expr2 =
                new TernaryOperation(new IntConstant(1), new IntConstant(5), new IntConstant(1));
        System.out.println("result3.1: " + expr2);


        IntExpression sub =
                new SubtractOperation(
                        new IntConstant(-5),
                        new SubtractOperation(
                                new IntConstant(-8),
                                new IntConstant(-13)));

        System.out.println("result4: " + sub);

        IntExpression ex5 =
                new AddOperation(
                        new NotOperation(0),
                        new DivideOperation(
                                new MinusOperation(0),
                                new IntConstant(5)
                        )
                );
        System.out.println("result5: " + ex5);


        IntExpression ex4 =
                new MinusOperation(-5);

        System.out.println("result6: " + ex4);


    }
}