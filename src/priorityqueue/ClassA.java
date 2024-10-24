package priorityqueue;

import java.util.PriorityQueue;

public class ClassA {
    public void method1() {
        System.out.println("Implementing the PriorityQueue");
        System.out.println("It does not allow null values and orders elements in their natural order (ascending).");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(40);
        priorityQueue.add(15);
        priorityQueue.add(5);
        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("-------------");
        System.out.println("Size of PriorityQueue: " + priorityQueue.size());
        System.out.println("Retrieving elements in natural order using poll():");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(40);

        System.out.println("-------------");
        System.out.println("Head of the PriorityQueue (using peek()): " + priorityQueue.peek());
        System.out.println("Is PriorityQueue empty? " + priorityQueue.isEmpty());
        System.out.println("Adding element 35 to PriorityQueue.");
        priorityQueue.add(35);
        System.out.println("After adding 35: " + priorityQueue);

        System.out.println("Removing element 10 from PriorityQueue.");
        priorityQueue.remove(10);
        System.out.println("After removing 10: " + priorityQueue);

        // Checking if PriorityQueue contains specific elements
        System.out.println("Does PriorityQueue contain 20? " + priorityQueue.contains(20));
        System.out.println("Does PriorityQueue contain 100? " + priorityQueue.contains(100));
    }

    public static void main(String[] args) {
        ClassA pq = new ClassA();
        pq.method1();
    }
}
