package collectionswithexample;

import java.util.HashMap;
import java.util.Map;

public class MapIterations {
    public  void method1(){
        Map<Integer,String> values=new HashMap<Integer,String>();
        values.put(1,"Laptop");
        values.put(2, "Phone");
        values.put(3, "Tablet");
        System.out.println(values);
       for(Map.Entry<Integer,String> entry:values.entrySet()){
           System.out.println("Product ID : "+entry.getKey() + ","  +"product name" + entry.getValue());
       }
    }

    public static void main(String[] args) {
        MapIterations mapIterations=new MapIterations();
        mapIterations.method1();
    }
}
