package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortAndReverse {
    public void method1(){
        List<Integer> values= Arrays.asList(5, 10, 15, 20, 25, 30);
        System.out.println("Print the values : "+values);
        Set<Integer> reverseofOdd=values.stream()
                .filter(n->n%2!=0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toSet());
        System.out.println(reverseofOdd);
    }

    public static void main(String[] args) {
        SortAndReverse sortAndReverse=new SortAndReverse();
        sortAndReverse.method1();
    }
}
