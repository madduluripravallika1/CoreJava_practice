package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CharacterCount {
    public void method(){
        List<String> values= Arrays.asList("sun", "moon", "stars", "sky");
        System.out.println(values);
        List<Integer> charcount=values.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(charcount);
    }

    public static void main(String[] args) {
        CharacterCount characterCount=new CharacterCount();
        characterCount.method();
    }
}
