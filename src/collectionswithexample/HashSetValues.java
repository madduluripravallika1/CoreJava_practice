package collectionswithexample;

import collections.Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetValues {
    public void method1(){
        Set<Integer> values=new HashSet<>(Arrays.asList(101, 102, 103, 101,104,100,1976,54782, 102, 103, 101,104,100,1976));
        System.out.println(values);

    }

    public static void main(String[] args) {
        HashSetValues hashSetValues=new HashSetValues();
        hashSetValues.method1();
    }
}
