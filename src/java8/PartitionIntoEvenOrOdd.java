package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitionIntoEvenOrOdd {
    public void method1(){
        List<Integer> values= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Print :"+values);
        Map<Boolean,List<Integer>> partition=values.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(partition);
    }

    public static void main(String[] args) {
        PartitionIntoEvenOrOdd partitionIntoEvenOrOdd=new PartitionIntoEvenOrOdd();
        partitionIntoEvenOrOdd.method1();
    }
}
