package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
    public void method1(){
        List<String> delimeter= Arrays.asList("Java", "Python", "C++", "JavaScript");
        System.out.println("Print the values : "+delimeter);
        String values=delimeter.stream()
                .collect(Collectors.joining(","));
        System.out.println(values);

    }

    public static void main(String[] args) {
        JoinStrings jionStrings=new JoinStrings();
        jionStrings.method1();
    }
}
