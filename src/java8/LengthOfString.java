package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LengthOfString {
    public void method1(){
        List<String> value= Arrays.asList("apple", "banana", "orange", "mango", "peach");
        System.out.println("Printing the strings :"+value);
        List<Integer> count=value.stream()
                .map(n->n.length())
                .collect(Collectors.toList());
        System.out.println(count);


    }

    public static void main(String[] args) {
        LengthOfString lengthOfString=new LengthOfString();
        lengthOfString.method1();
    }
}
