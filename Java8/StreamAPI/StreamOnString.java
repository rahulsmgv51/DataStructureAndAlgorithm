package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOnString {
    public static void main(String[] args) {
        String str = "the Streams concept was introduced to process objects of collections efficiently";
        String res = Arrays.stream(str.split(" "))
                           .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                           .collect(Collectors.joining(" "));
        System.out.println(res);

        String res2 = Arrays.stream(str.split(" "))
                            .map(word -> word.substring(0).toUpperCase())
                            .collect(Collectors.joining(" "));

        System.out.println(res2);

        String[] strArr = {"HELLO", "WORLD", "MY", "NAME", "RAHULSMGV"};
        List<String> res1 = Arrays.stream(strArr)
                             .map(str1 -> str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase())
                             .collect(Collectors.toList());

        System.out.println(res1);
    
    }
}