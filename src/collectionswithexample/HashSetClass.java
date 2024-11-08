package collectionswithexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetClass {
    public  void method1(){
        Set<String> set1=new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
        Set<String> set2=new HashSet<>(Arrays.asList("banana", "date", "apple"));
        System.out.println(set1);
        System.out.println(set2);
        Set<String> set3=new LinkedHashSet<>(set1);
        set3.addAll(set2);
        System.out.println(set3);

    }

    public static void main(String[] args) {
        HashSetClass hashSetClass=new HashSetClass();
        hashSetClass.method1();
    }
}
