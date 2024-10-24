package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
    public  void method1() {
     List<Integer> values=new ArrayList<>();
     for(int i=0;i<=100;i++){
         values.add(i);
     }
     System.out.println("Original Code is : "+values);
     List<Integer> oddvalues=values.stream()
             .filter(n->n%2==0)
             .map(m->m*m)
             .collect(Collectors.toList());
        System.out.println(oddvalues);
    }

    public static void main(String[] args) {
        StreamOperations streamOperations=new StreamOperations();
        streamOperations.method1();
    }

}
