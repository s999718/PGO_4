import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Multiplier class
        Multiplier multiplier = new Multiplier();

        // Testing Multiplier methods
        int result1 = multiplier.multiply(2, 3);
        System.out.println("Multiplication result (int): " + result1);

        int result2 = multiplier.multiply(2, 3, 4, 5);
        System.out.println("Multiplication result (int, int, int, int): " + result2);

        double result3 = multiplier.multiply(2.5, 3.0);
        System.out.println("Multiplication result (double): " + result3);

        BigDecimal bigDecimal1 = new BigDecimal("10.5");
        BigDecimal bigDecimal2 = new BigDecimal("2.5");
        BigDecimal result4 = multiplier.multiply(bigDecimal1, bigDecimal2);
        System.out.println("Multiplication result (BigDecimal): " + result4);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int result5 = multiplier.multiply(integerList);
        System.out.println("Multiplication result (List<Integer>): " + result5);

        // Create an instance of the Adder class
        Adder adder = new Adder();

        // Testing Adder methods
        int sum1 = adder.add(10, 20);
        System.out.println("Addition result (int): " + sum1);

        List<BigDecimal> bigDecimalList = new ArrayList<>(Arrays.asList(
                new BigDecimal("10.5"),
                new BigDecimal("20.3"),
                new BigDecimal("5.2")
        ));
        BigDecimal sum2 = adder.add(bigDecimalList);
        System.out.println("Addition result (BigDecimal): " + sum2);

        // Create an instance of the Address class
        Address address = new Address("Poland", "Warsaw", "00-123", "Main Street", "5A");

        // Testing Address methods
        String address1 = address.createAddress("Poland");
        System.out.println("Address 1: " + address1);

        String address2 = address.createAddress("Poland", "Warsaw");
        System.out.println("Address 2: " + address2);

        String address3 = address.createAddress("Poland", "Warsaw", "00-123");
        System.out.println("Address 3: " + address3);

        String address4 = address.createAddress("Poland", "Warsaw", "00-123", "Main Street");
        System.out.println("Address 4: " + address4);

        String address5 = address.createAddress("Poland", "Warsaw", "00-123", "Main Street", "5A");
        System.out.println("Address 5: " + address5);
    }
}
