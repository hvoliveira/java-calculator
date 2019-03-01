public class SumSquare implements MathOperator {
    @Override
    public double calculate(OperatorParams params) {
        return Math.pow(params.getN1(),2) + Math.pow(params.getN2(),2);
    }
}
