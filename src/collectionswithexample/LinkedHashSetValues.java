package collectionswithexample;

import java.util.*;

public class LinkedHashSetValues {
    public  void method1(){
        Set<Integer> values =new HashSet<>();
        values.add(5);
        values.add(8);
        values.add(12);
        values.add(8);
        values.add(3);
        System.out.println(values);
        List<Integer> sortedList =new ArrayList<>(values);
//        Collection.sort(sortedList);
        Collections.sort(sortedList);
        System.out.println(sortedList);
    }

    public static void main(String[] args) {
        LinkedHashSetValues linkedHashSetValues=new LinkedHashSetValues();
        linkedHashSetValues.method1();
    }
}
