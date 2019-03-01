import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringParser {

    private double n1;
    private double n2;
    private String operator;

    public void parseString(String string) {

        List<String> tokens =
                new ArrayList<>(Arrays
                        .asList(string
                                .split("((?<=[%/\\^\\*\\+-])|(?=[%/\\^\\*\\+-]))")));

        if(tokens.contains("%")) {
            this.operator = "%";
            tokens.remove("%");
            tokens.remove("*");
            n1 = Double.parseDouble(tokens.remove(0));
            n2 = Double.parseDouble(tokens.remove(0));
        } else {
            n1 = Double.parseDouble(tokens.remove(0));
            operator = tokens.remove(0);
            n2 = Double.parseDouble(tokens.remove(0));
        }
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}

