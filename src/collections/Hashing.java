package collections;

import java.util.HashSet;
import java.util.Set;

public class Hashing {
    public void method1(){
        Set<Integer> value=new HashSet<>();
        for (int i=0;i<=10;i++){
            value.add(i);
        }
        System.out.println("The Set is : "+value);
        value.add(5);
        System.out.println("The Updated Set is : "+value);
        if(value.contains(7)){
            System.out.println("Print that  7 is there");
        }else{
            System.out.println("Print 7 is not in the list");
        }

    }

    public static void main(String[] args) {
        Hashing hashing=new Hashing();
        hashing.method1();
    }
}
