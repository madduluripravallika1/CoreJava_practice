package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListtoMap {
    public void method1(){
      List<String> values= Arrays.asList("apple", "banana", "cherry", "date", "fig");
      System.out.println("Print the Values : "+values);
      Map<Integer,List<String>> lengthof=values.stream()
              .collect(Collectors.groupingBy(String::length));
        System.out.println(lengthof);
    }


    public static void main(String[] args) {
        ListtoMap listtoMap=new ListtoMap();
        listtoMap.method1();
    }
}
