package collectionswithexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPerformance {
    public  void method1(){
        List<Integer> values=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(" Intial List  "+values);
        System.out.println("values[0] = " + values.get(0));
        System.out.println("values[1] = " + values.get(1));
        System.out.println("values[2] = " + values.get(2));
        System.out.println("values[3] = " + values.get(3));
        System.out.println("values[4] = " + values.get(4));
        values.set(2,10);
        values.set(3,100);
        values.set(4,1000);
        System.out.println("Print the Updates Values List :"+values);
        System.out.println("--------------------------");
        System.out.println();
//

    }

    public static void main(String[] args) {
        ListPerformance listPerformance=new ListPerformance();
        listPerformance.method1();
    }
}
