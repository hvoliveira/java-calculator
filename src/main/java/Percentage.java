public class Percentage implements MathOperator {

    @Override
    public double calculate(OperatorParams params) {
        return params.getN1() * (params.getN2()/100);
    }
}
