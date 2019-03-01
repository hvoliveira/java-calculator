import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addition(){
        Addition addition = new Addition();
        double sum = addition.calculate(new OperatorParams(5, 5));
        assert sum == 10;
    }

    @Test
    public void subtraction() {
        Subtraction subtraction = new Subtraction();
        double sub = subtraction.calculate(new OperatorParams(10, 5));
        assert sub == 5;
    }

    @Test
    public void percentage() {
        Percentage percentage = new Percentage();
        double perc = percentage.calculate(new OperatorParams(50, 10));
        assert perc == 5;
    }

    @Test
    public void multiplication() {
        Multiplication multiplication = new Multiplication();
        double product = multiplication.calculate(new OperatorParams(10, 4));
        assert product == 40;
    }

    @Test
    public void division() {
        Division division = new Division();
        double product = division.calculate(new OperatorParams(20, 5));
        assert product == 4;
    }

    @Test
    public void stringParser() {
        StringParser parser = new StringParser();
        parser.parseString("100/200");
        assert parser.getN1() == 100;
        assert parser.getOperator().equals("/");
        assert parser.getN2() == 200;
    }
}