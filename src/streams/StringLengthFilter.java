package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringLengthFilter {
    public void method(){
        List<String> value= Arrays.asList("Apple","Banana","Orange","Kiwi","Watermelon","Grapes","Pineapple","Pear","Cherry","Blueberry","Strawberry","Fig","Papaya","Coconut","Peach","Raspberry","Apricot","Melon","Blackberry","Cantaloupe");
        System.out.println(value);
        Set<String> lengthof=value.stream()
                .filter(n->n.length()<=5)
                .collect(Collectors.toSet());
        System.out.println(lengthof);
    }

    public static void main(String[] args) {
        StringLengthFilter stringLengthFilter=new StringLengthFilter();
        stringLengthFilter.method();
    }
}
