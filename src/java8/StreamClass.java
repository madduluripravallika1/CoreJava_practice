package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamClass {
    public void method1() {

        List<Integer> li = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        System.out.println(li);
        Set<Integer> resultset =li.stream()
                .filter(n->n%2==0)
                .map(m->m*2)
                .collect(Collectors.toSet());
        System.out.println(resultset);
    }

    public static void main(String[] args) {
        StreamClass streamClass=new StreamClass();
        streamClass.method1();
    }
}
