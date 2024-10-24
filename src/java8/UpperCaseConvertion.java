package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UpperCaseConvertion {
    public void method1(){
        List<String> words= Arrays.asList("apple", "banana", "orange", "mango", "peach");
        System.out.println("Arrays are : "+words);
        Set<String> captial=  words.stream()
                .map(n->n.toUpperCase())
                .collect(Collectors.toSet());
        System.out.println(captial);

    }

    public static void main(String[] args) {
        UpperCaseConvertion upperCaseConvertion=new UpperCaseConvertion();
        upperCaseConvertion.method1();
    }
}
