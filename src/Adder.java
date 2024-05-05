import java.math.BigDecimal;
import java.util.List;

public class Adder {
    public int add(int a, int b) {
        return a + b;
    }

    public BigDecimal add(List<BigDecimal> bigDecimals) {
        BigDecimal sum = BigDecimal.ZERO;
        for (BigDecimal num : bigDecimals) {
            sum = sum.add(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        Adder adder = new Adder();

        // Example usage for int addition
        int result1 = adder.add(10, 20);
        System.out.println("Result of int addition: " + result1);

        // Example usage for BigDecimal addition
        List<BigDecimal> bigDecimalList = List.of(
                new BigDecimal("10.5"),
                new BigDecimal("20.3"),
                new BigDecimal("5.2")
        );
        BigDecimal result2 = adder.add(bigDecimalList);
        System.out.println("Result of BigDecimal addition: " + result2);
    }
}
