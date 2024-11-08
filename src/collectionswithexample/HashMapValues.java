package collectionswithexample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapValues {
    public  void method1(){
        Map<String,Integer> values= new HashMap<>();
        values.put("John",123-456-7890);
        values.put("Jane",987-654-3210);
        values.put("John",123-456-7890);
        System.out.println(values);
    }

    public static void main(String[] args) {
        HashMapValues hashMapValues=new HashMapValues();
        hashMapValues.method1();
    }
}
