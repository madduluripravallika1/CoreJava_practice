package linkedhashmap;

import java.util.LinkedHashMap;

public class ClassA {
    public void method1(){
        System.out.println("Implementing the LinkedHashMap");

        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10, "Java");
        linkedHashMap.put(20, "Python");
        linkedHashMap.put(30, ".Net");
        linkedHashMap.put(500, 1000);
        linkedHashMap.put(40, null);
        linkedHashMap.put(60, "Java");

        System.out.println("Printing The LinkedHashMap: " + linkedHashMap);


        System.out.println("Getting the value for key 10: " + linkedHashMap.get(10));
        System.out.println("Getting the value for key 20: " + linkedHashMap.get(20));
        System.out.println("Getting the value for key 30: " + linkedHashMap.get(30));
        System.out.println("Getting the value for key 500: " + linkedHashMap.get(500));
        System.out.println("Getting the value for key 40: " + linkedHashMap.get(40));
        System.out.println("Getting the value for key 60: " + linkedHashMap.get(60));
        System.out.println("--------------------");


        System.out.println("Is the LinkedHashMap empty: " + linkedHashMap.isEmpty());


        System.out.println("Does key 10 exist" + linkedHashMap.containsKey(10));
        System.out.println("Does key 20 exist " + linkedHashMap.containsKey(20));
        System.out.println("Does key 30 exist " + linkedHashMap.containsKey(30));
        System.out.println("Does key 500 exist" + linkedHashMap.containsKey(500));
        System.out.println("Does key 5000000 exist " + linkedHashMap.containsKey(5000000));
        System.out.println("--------------------");


        System.out.println("Does value 'Java' exist " + linkedHashMap.containsValue("Java"));
        System.out.println("Does value 'Python' exist " + linkedHashMap.containsValue("Python"));
        System.out.println("-------------------");


        System.out.println("Size of LinkedHashMap: " + linkedHashMap.size());
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.method1();
    }
}
