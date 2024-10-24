package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class UniqueElements {
    public void method1(){
        List<Integer> unique = Arrays.asList(10, 20, 10, 30, 20, 40, 50, 10);
        System.out.println(unique);
        long  count123=unique.stream()
                .distinct()
                .count();
        System.out.println(count123);

    }

    public static void main(String[] args) {
        UniqueElements uniqueElements=new UniqueElements();
        uniqueElements.method1();
    }
}
