public class Subtraction implements MathOperator {
    @Override
    public double calculate(OperatorParams params) {
        return params.getN1() - params.getN2();
    }
}
