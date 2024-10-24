package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ClassA {
    public void method1(){
        System.out.println("implementing the Arraylist in the collections");
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add("java");
        al.add(null);
        al.add(10);
        al.add('a');
        al.add(85);
        al.add(52);
        al.add(99);
        System.out.println(al +"\n");
        System.out.println("---------------------------");
        System.out.println("size of an ArrayList "+al.size()+"\n");
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        System.out.println(al.get(4));
        System.out.println(al.get(5));
        System.out.println(al.get(6));
        System.out.println(al.get(7));
        System.out.println(al.get(8));
        System.out.println(al.get(al.size()-1)+"\n");
        System.out.println("Retrieving the data by using the for each loop");
        for(int i=0;i<= al.size()-1;i++){
            System.out.println(al.get(i));
        }
        System.out.println("\nRetrieving data using for-each loop");
        for (Object item : al) {
            System.out.println(item);
        }
        System.out.println("\n");
        System.out.println("Retrieving the data by using the reversing order");
        for( int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
        System.out.println("Excuting the methods in the ArrayList");
        System.out.println("isEmpty :"+ al.isEmpty());
        ArrayList al2=new ArrayList();
        al2.add(20);
        al2.add("java");
        System.out.println(al2);
        System.out.println("is cantain :"+al2.containsAll(al));
//        al.remove(2);
        System.out.println("After removing the al2 is :"+al);
//        al.remove(Integer.valueOf(10));
        System.out.println("After removing the 1st occurance of 10:"+al);
        al.add(al2);
        System.out.println(al);
        al.retainAll(al2);
        System.out.println(al); // Retaing means common elements i the al and al2

//        al.clear();
//        System.out.println("After clearing the ArrayList: " + al);
//        System.out.println("Is al empty after clearing? " + al.isEmpty());

    }

    public static void main(String[] args) throws Exception {
        ClassA arraylist=new ClassA();
        arraylist.method1();
    }
}
