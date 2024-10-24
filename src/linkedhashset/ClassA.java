package linkedhashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassA {
    public  void method1(){
        System.out.println("Implementing LinkedHashSet");
        System.out.println("It does not allow duplicates, allows null values & maintains insertion order.");
        LinkedHashSet  linkedHashSet=new LinkedHashSet();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add("java");
        linkedHashSet.add(null);
        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add('a');
        linkedHashSet.add(99);
        linkedHashSet.add(52);
        System.out.println(linkedHashSet);
        System.out.println("--------");
        System.out.println("size of an alinked set "+linkedHashSet.size());
        System.out.println("Retrieving elements:");
        for (Object element : linkedHashSet) {
            System.out.println(element);
        }

        System.out.println("Is LinkedHashSet empty :" + linkedHashSet.isEmpty());
        linkedHashSet.add(10);
        System.out.println("After attempting to add duplicate element 10: " + linkedHashSet);
        System.out.println("Does LinkedHashSet contain 'java'? " + linkedHashSet.contains("java"));
        System.out.println("Does LinkedHashSet contain 500? " + linkedHashSet.contains(500));
//        linkedHashSet.remove(100);
//        System.out.println("After removing 100: " + linkedHashSet);

        linkedHashSet.add(9999);
        System.out.println("After adding 9999: " + linkedHashSet);
//
//        // Removing all elements
//        linkedHashSet.clear();
//        System.out.println("After clearing LinkedHashSet: " + linkedHashSet);


        linkedHashSet.add(10);
        linkedHashSet.add("java");
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        System.out.println("LinkedHashSet after re-adding elements: " + linkedHashSet);

        ArrayList<Object> list = new ArrayList<>(linkedHashSet);


        System.out.println("First element (get(0)): " + list.get(0));

        System.out.println("Second element (get(1)): " + list.get(1));
        System.out.println("Third element (get(2)): " + list.get(2));
    }

    public static void main(String[] args) {
        ClassA classA=new ClassA();
        classA.method1();
    }
}
