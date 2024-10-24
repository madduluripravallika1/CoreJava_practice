package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountingElements {
    public void method(){
        List<Integer> value= Arrays.asList( 50,12, 45, 67, 23, 89, 50, 34, 76, 91, 48, 53, 22, 80, 66, 11, 95, 30, 55, 72, 40);
        System.out.println(value);
        Set<Integer> count=value.stream()
                .filter(n->n<=50)
                .collect(Collectors.toSet());
        System.out.println(count);
    }

    public static void main(String[] args) {
        CountingElements countingElements=new CountingElements();
        countingElements.method();
    }
}
