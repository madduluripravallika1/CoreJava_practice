package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumLength {
    public void method1(){
        List<String> value= Arrays.asList("cat", "elephant", "dog", "hippopotamus", "giraffe");
        System.out.println("Print the value : "+value);
        String maximum=value.stream()
                        .max(Comparator.comparing(String::length))
                                .orElse("No StringFound");
        System.out.println(maximum);

    }

    public static void main(String[] args) {
        MaximumLength maximumLength=new MaximumLength();
        maximumLength.method1();
    }
}
