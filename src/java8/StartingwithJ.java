package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StartingwithJ {
    public  void method1(){
        List<String> starting= Arrays.asList("James", "John", "Alex", "Jessica", "Jordan", "Mike");
        System.out.println("Print the values : "+starting);
        Set<String> value =starting.stream()
                .filter(n->n.startsWith("J"))
                .collect(Collectors.toSet());
        System.out.println(value);
    }

    public static void main(String[] args) {
        StartingwithJ startingwithJ =new StartingwithJ();
        startingwithJ.method1();
    }
}
