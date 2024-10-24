package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SquareTheNumber {
    public void method1(){
        List<Integer> square= Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Print the values : "+square);
        Set<Integer> values=square.stream()
                .map(n->n*2)
                .collect(Collectors.toSet());
        System.out.println(values);
    }

    public static void main(String[] args) {
        SquareTheNumber squareTheNumber=new SquareTheNumber();
        squareTheNumber.method1();
    }
}
