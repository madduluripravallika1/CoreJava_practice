package collectionswithexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetIntersection {
    public  void method1(){
        Set<Integer> set1= new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2=new HashSet<>(Arrays.asList(3, 4, 5, 6));
        System.out.println(set1);
        System.out.println(set2);
        System.out.println("Printing the Intersecting the set1 and set2");
        Set<Integer> set3=new HashSet<>(set1);
        set3.retainAll(set2);
        System.out.println(set3);


    }

    public static void main(String[] args) {

        SetIntersection setIntersection=new SetIntersection();
        setIntersection.method1();
    }
}
