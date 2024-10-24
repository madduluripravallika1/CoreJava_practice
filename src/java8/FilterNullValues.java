package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullValues {
    public void method1(){
        List<String> filtering= Arrays.asList("John", null, "Sarah", null, "Bob");
        System.out.println("Printing the fioltering values : "+filtering);
        List<String> values=filtering.stream()
                .filter(n->n!=null)
                .collect(Collectors.toList());
        System.out.println(values);
    }

    public static void main(String[] args) {
        FilterNullValues filterNullValues=new FilterNullValues();
        filterNullValues.method1();
    }
}
