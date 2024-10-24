package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctNumbers {
    public void method1(){
        List<Integer> number= Arrays.asList(2, 4, 3, 2, 5, 3, 4, 6, 7);
        System.out.println("Printing the numbers : "+number);
        Set<Integer> distinct=number.stream().distinct()
                .collect(Collectors.toSet());
        System.out.println(distinct);
    }

    public static void main(String[] args) {
        DistinctNumbers distinctNumbers=new DistinctNumbers();
        distinctNumbers.method1();
    }
}
