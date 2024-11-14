package BasicPrograms;

import javax.imageio.stream.ImageInputStream;

public class FibonacciCalculation {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.print(first+" "+ second+" ");
        int next;
        next = first + second;
        for (int n = 3; n < 10; n++) {
            next = first + second;
            System.out.print(" "+ next  + " ");
            first = second;
            second = next;


        }


    }
}