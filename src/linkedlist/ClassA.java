package linkedlist;

import java.util.LinkedList;

public class ClassA {
    public void method1(){
        System.out.println("Implementing the Linked List ");
        System.out.println("It allows duplicates, null & insertion order is maintained.");
        LinkedList linkedList=new LinkedList();
        linkedList.add(10);
        linkedList.add("java");
        linkedList.add(20);
        linkedList.add(null);
        linkedList.add(10);
        linkedList.add('a');
        linkedList.add(85);
        linkedList.add(52);
        linkedList.add(99);
        System.out.println(linkedList);
        System.out.println("-------------");
        System.out.println("size of an Linked List "+linkedList.size());
        System.out.println("Retrieving the data by using front end");
        for(int i=0;i<=linkedList.size()-1;i++){
            System.out.println(linkedList.get(i));
        }
        System.out.println("by usuing the for each loop");
        for (Object values:linkedList){
            System.out.println(values);
        }

        System.out.println("-------------");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.size()-1);

        System.out.println(" retreiving the data by using the reverse order");
        for (int i=linkedList.size()-1;i>=0;i--){
            System.out.println(linkedList.get(i));
        }
        System.out.println("Excuting the methods in the linked list");
        System.out.println("is Empty "+linkedList.isEmpty());
        LinkedList linkedList1=new LinkedList();
        linkedList1.add(20);
        linkedList1.add("java");
        System.out.println("Containg All the data into the lists");
        System.out.println("containsAll " +linkedList1.containsAll(linkedList));
        System.out.println();
        System.out.println("First Element in: "+linkedList.getFirst());
        System.out.println("last Element in: "+linkedList.getLast());
        System.out.println("First Element in: "+linkedList.removeFirst());
        System.out.println("First Element in: "+linkedList.removeLast());
        System.out.println("After removing the fisrt elemnet and last element :"+linkedList);
        linkedList.addFirst(100);
        System.out.println(linkedList);
        linkedList.addLast(200);
        System.out.println(linkedList);
        linkedList.addAll(linkedList1);
        System.out.println(linkedList);


        linkedList.clear();
        System.out.println("After clearing the ArrayList: " + linkedList);
        System.out.println("Is al empty after clearing? " + linkedList.isEmpty());


    }

    public static void main(String[] args) {
        ClassA li=new ClassA();
        li.method1();
    }
}
