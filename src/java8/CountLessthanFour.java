package java8;

import java.util.Arrays;
import java.util.List;


public class CountLessthanFour {
    public  void method1(){
       List<String> lessthan= Arrays.asList("Tom", "Jerry", "Michael", "John", "Jessica");
        System.out.println("Printing the Values :"+lessthan);
        System.out.println("---------------");
        long  countvalue=lessthan.stream()
                .filter(n->n.length()>4)
//                .collect(Collectors.toSet())
                .count();
        System.out.println("Number of names with more than 4 characters:"+countvalue);
        System.out.println(countvalue);
    }

    public static void main(String[] args) {
        CountLessthanFour countLessthanFour=new CountLessthanFour();
        countLessthanFour.method1();
    }
}
