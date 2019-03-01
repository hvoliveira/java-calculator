import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringParser stringParser = new StringParser();
        System.out.println("Type math operation:");
        stringParser.parseString(scanner.nextLine());

        OperatorFactory factory = new OperatorFactory();
        MathOperator operator = factory.getOperator(stringParser.getOperator());

        OperatorParams params = new OperatorParams(stringParser.getN1(), stringParser.getN2());
        System.out.println("Operator: " + operator + " | Result: "+ operator.calculate(params));

    }
}
