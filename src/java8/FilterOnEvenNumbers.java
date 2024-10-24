package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterOnEvenNumbers {
    public void method1(){
        List<Integer> numbers= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Set<Integer> num1= numbers.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toSet());
        System.out.println(num1);

    }

    public static void main(String[] args) {
        FilterOnEvenNumbers filterOnEvenNumbers=new FilterOnEvenNumbers();
        filterOnEvenNumbers.method1();
    }
}
