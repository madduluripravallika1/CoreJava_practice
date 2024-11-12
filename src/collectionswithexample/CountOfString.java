package git ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOfString {
    public void method1(String input){
       Map<Character,Integer> values=new HashMap<Character,Integer>();
        for (char ch : input.toCharArray()) {
            values.put(ch, values.getOrDefault(ch, 0) + 1);
        }
        System.out.println(values);

    }

    public static void main(String[] args) {
        CountOfString countOfString=new CountOfString();
        countOfString.method1("aabbbc");
    }
}
