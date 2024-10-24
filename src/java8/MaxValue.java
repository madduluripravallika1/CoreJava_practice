package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MaxValue {
    public void method1(){
        List<Integer> value= Arrays.asList(3, 7, 2, 9, 12, 5);
        System.out.println("printing the values : "+value);
        Integer maxValue = value.stream()
                .max(Integer::compareTo)
                .orElseThrow(() -> new RuntimeException("List is empty!"));

        System.out.println("Max value: " + maxValue);
    }
    public static void main(String[] args) {
        MaxValue maxValue=new MaxValue();
        maxValue.method1();
    }
}
