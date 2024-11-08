package collectionswithexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfNames {
    public  void method1(){
        List<String> names= new ArrayList<>(Arrays.asList("Alice", "Bob", "Alice", "Charlie"));
        System.out.println(names);

    }

    public static void main(String[] args) {
        ListOfNames listOfNames=new ListOfNames();
        listOfNames.method1();
    }
}
