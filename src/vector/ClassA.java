package vector;

import java.util.Vector;



public class ClassA {
    public void method1(){
        System.out.println("Implementing the vector");
        System.out.println("It allows duplicates, null values & maintains insertion order.");
        Vector vector=new Vector();
        vector.add(10);
        vector.add("java");
        vector.add(20);
        vector.add(null);
        vector.add('a');
        vector.add(100);
        vector.add(200);
        vector.add(85);
        vector.add(52);
        vector.add(99);
        System.out.println(vector);
        System.out.println("-----------");
        System.out.println("size of an vector"+vector.size());
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.get(2));
        System.out.println(vector.get(3));
        System.out.println(vector.get(4));
        System.out.println(vector.get(5));
        System.out.println(vector.get(6));
        System.out.println(vector.get(7));
        System.out.println("------------------");

        for(int i=0; i<=vector.size()-1;i++){
            System.out.println(vector.get(i));
        }
        System.out.println("by using the for each loop ");
        for (Object values: vector){
            System.out.println(values);
        }

        System.out.println("Retrieving the data by using the reversing order");
        for( int i=vector.size()-1;i>=0;i--){
            System.out.println(vector.get(i));
        }
        System.out.println("methods");
        System.out.println();
        System.out.println("is empty "+vector.isEmpty());
        Vector vector1=new Vector();
        vector1.add(10);
        vector1.add(100);
        System.out.println("containsAll "+vector1.containsAll(vector));
        System.out.println();
        System.out.println("First Elemnt in vector"+vector.firstElement());
        System.out.println("last Elemnt in vector"+vector.lastElement());
        System.out.println("Removed first elemnt"+vector.remove(0));
        System.out.println("removed last element"+vector1.removeLast());
        System.out.println("After the first and last "+vector);
        vector.add(0,1000);
        System.out.println(vector);
        vector.add(5,9999);
        System.out.println(vector);
        vector.addElement(50);
        System.out.println("After adding 50 using addElement: " + vector);
        vector.removeElement("java");
        System.out.println("After removing 'java': " + vector);
        vector.removeElementAt(2);
        System.out.println("After removing element at index 2: " + vector);
        vector.removeAllElements();
        System.out.println("After removing all elements: " + vector);
        vector.add(10);
        vector.add("java");
        vector.add(20);
        vector.add(30);
        vector.add(40);
        System.out.println("Vector after re-adding elements: " + vector);
        System.out.println("Element at index 1: " + vector.elementAt(1));
        System.out.println("Last Element in Vector: " + vector.lastElement());
        System.out.println("First Element in Vector: " + vector.firstElement());
    }


    public static void main(String[] args) {
        ClassA classA=new ClassA();
        classA.method1();
    }
}
