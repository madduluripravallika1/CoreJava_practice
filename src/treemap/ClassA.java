package treemap;

import java.util.TreeMap;

public class ClassA {
    public void method1(){
        System.out.println("Implementing the tree map");
        TreeMap<Object,Object> treeMap=new TreeMap<Object,Object>();
        treeMap.put(10,"Java");
        treeMap.put(20,"Python");
        treeMap.put(30,".Net");
        treeMap.put(500,1000);
        treeMap.put(40,null);
        treeMap.put(60,"Java");
        System.out.println("Printing The TreeMap : "+treeMap);
        System.out.println("getting the 10 key value: "+treeMap.get(10));
        System.out.println("get the value :"+treeMap.get(20));
        System.out.println("get the value:"+ treeMap.get(30));
        System.out.println("get the value :"+treeMap.get(500));
        System.out.println("get the value :"+treeMap.get(40));
        System.out.println(" get the vqalue :"+ treeMap.get(60));
        System.out.println("--------------------");
        System.out.println("Does  exist:"+treeMap.isEmpty());
        System.out.println("Does 10 key exists"+treeMap.containsKey(10));
        System.out.println("Does 20 key exists"+treeMap.containsKey(20));
        System.out.println("Does 30 key exists"+treeMap.containsKey(30));
        System.out.println("Does 500 key exists "+treeMap.containsKey(500));
        System.out.println("Does 5000000 key exists "+treeMap.containsKey(5000000));
        System.out.println("-----------------");
        System.out.println("Does 10 key of value is"+treeMap.containsValue("Java"));
        System.out.println("Does 20 key od value is "+treeMap.containsValue("Python"));
        System.out.println(treeMap);
        System.out.println("-------------------");
//        treeMap.remove(10);
//        System.out.println("After removing the 10 key then, the tree map is "+treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println("size of an tree map "+treeMap.size());
    }

    public static void main(String[] args) {
        ClassA classA=new ClassA();
        classA.method1();
    }
}
