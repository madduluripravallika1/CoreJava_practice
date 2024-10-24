package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindStartsWithA {
    public void method1(){
        List<String> startswith= Arrays.asList("Apple", "banana", "Avocado", "apricot", "Mango");
        System.out.println("Printing the values : "+startswith);
        Set<String> value=startswith.stream()
                .filter(n->n.startsWith("A"))
                .collect(Collectors.toSet());
        System.out.println("the characters are startswith A : "+value);
    }

    public static void main(String[] args) {
        FindStartsWithA findStartsWithA=new FindStartsWithA();
        findStartsWithA.method1();
    }
}
