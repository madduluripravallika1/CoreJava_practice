package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupNumbersbyOddEven {
    public void method1(){
        List<Integer> oddEven = Arrays.asList(11, 22, 33, 44, 55, 66, 77);
        System.out.println("Print the values : "+oddEven);
        Map<Boolean,List<Integer>> grouping =oddEven.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(grouping);
    }

    public static void main(String[] args) {
        GroupNumbersbyOddEven groupNumbersbyOddEven=new GroupNumbersbyOddEven();
        groupNumbersbyOddEven.method1();
    }
}
