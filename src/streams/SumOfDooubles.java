package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfDooubles {
    public void method1() {
        List<Double> values= Arrays.asList(12.5, 23.0, 34.5, 45.1, 56.2, 67.8, 78.3, 89.0, 90.5, 100.0);
        System.out.println(values);
       double sumof=values.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println(sumof);
    }

    public static void main(String[] args) {
        SumOfDooubles sumOfDooubles=new SumOfDooubles();
        sumOfDooubles.method1();
    }
}
