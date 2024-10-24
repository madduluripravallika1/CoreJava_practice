package hashmap;

import java.util.HashMap;

public class ClassB {
    public void method1(){
        System.out.println("Implementing the HashMap with the null values");
        HashMap<Object,Object> hashMap=new HashMap<Object,Object>();
        hashMap.put(null,"java");
        hashMap.put(101,"null");
        hashMap.put(102,".null");
        hashMap.put(null,"SalesForce");
        System.out.println(hashMap);
    }

    public static void main(String[] args) {
        ClassB classB=new ClassB();
        classB.method1();
    }
}
