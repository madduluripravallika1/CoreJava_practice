package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SumOfEvenNumbers {
    public  void method1(){
        List<Integer> sumof= Arrays.asList(10, 15, 25, 30, 40, 55, 60);
        System.out.println("printing the numbers :"+sumof);
        int  values=sumof.stream()
                .filter(n->n%2==0)
                .collect(Collectors.summingInt(n->n));
        System.out.println(values);

    }

    public static void main(String[] args) {
        SumOfEvenNumbers sumOfEvenNumbers=new SumOfEvenNumbers();
        sumOfEvenNumbers.method1();
    }
}
