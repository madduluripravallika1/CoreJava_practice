package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupsWordsByLength {
    public  void method1(){
      List<String> words= Arrays.asList("apple", "banana", "pear", "kiwi", "grape", "mango");
      System.out.println("Printing the words "+ words);
        Map<Integer, List<String>> group=words.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(group);
    }

    public static void main(String[] args) {
        GroupsWordsByLength groupsWordsByLength=new GroupsWordsByLength();
        groupsWordsByLength.method1();
    }
}
