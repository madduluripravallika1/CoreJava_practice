package treeset;

import java.util.TreeSet;

public class ClassA {
    public void method1(){
        TreeSet treeSet=new TreeSet();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(100);
        treeSet.add(200);
        treeSet.add(99);
        treeSet.add(98);
        System.out.println(treeSet);
        System.out.println("----------");
        System.out.println("size of an Treeset:"+treeSet.size());
        for(Object elements:treeSet){
            System.out.println(elements);
        }
        System.out.println("Treeset empty:"+treeSet.size());
        System.out.println("Does TreeSet contain 30:" + treeSet.contains(30));
        System.out.println("Does TreeSet contain 100: " + treeSet.contains(100));
        System.out.println("------");
        treeSet.add(50);
        System.out.println("After adding 50: " + treeSet);
        treeSet.remove(5);
        System.out.println("After removing 5: " + treeSet);
    }

    public static void main(String[] args) {
        ClassA classA=new ClassA();
        classA.method1();
    }
}
