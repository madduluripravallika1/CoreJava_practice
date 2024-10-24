package hashmap;

import java.util.HashMap;

public class ClassA {
    public void method1(){
        System.out.println("------------Implementing the HashMap");

        // Creating a HashMap
        HashMap<Object, Object> hashMap = new HashMap<>();


        hashMap.put(10, "Java");
        hashMap.put(20, "Python");
        hashMap.put(30, ".Net");
        hashMap.put(500, 1000);
        hashMap.put(40, null);
        hashMap.put(60, "Java");

        System.out.println("Printing The HashMap: " + hashMap);

        // Access values by keys
        System.out.println("Getting the value for key 10: " + hashMap.get(10));
        System.out.println("Getting the value for key 20: " + hashMap.get(20));
        System.out.println("Getting the value for key 30: " + hashMap.get(30));
        System.out.println("Getting the value for key 500: " + hashMap.get(500));
        System.out.println("Getting the value for key 40: " + hashMap.get(40));
        System.out.println("Getting the value for key 60: " + hashMap.get(60));
        System.out.println("--------------------");

        System.out.println("Is the HashMap empty: " + hashMap.isEmpty());

        System.out.println("Does key 10 exist " + hashMap.containsKey(10));
        System.out.println("Does key 20 exist " + hashMap.containsKey(20));
        System.out.println("Does key 30 exist " + hashMap.containsKey(30));
        System.out.println("Does key 500 exist " + hashMap.containsKey(500));
        System.out.println("Does key 5000000 exist " + hashMap.containsKey(5000000));
        System.out.println("--------------------");

        System.out.println("Does value 'Java' exist " + hashMap.containsValue("Java"));
        System.out.println("Does value 'Python' exist " + hashMap.containsValue("Python"));
        System.out.println("-------------------");


        System.out.println("Size of HashMap: " + hashMap.size());
    }

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.method1();
    }
}
