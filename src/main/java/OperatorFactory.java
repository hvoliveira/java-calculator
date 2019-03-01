public class OperatorFactory {

    public MathOperator getOperator(String token) {
        switch (token) {
            case "^":
                return new SumSquare();
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "%":
                return new Percentage();
            default:
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.out.println("Operator unrecognized");
                    e.printStackTrace();
                }
                return null;
        }
    }
}
