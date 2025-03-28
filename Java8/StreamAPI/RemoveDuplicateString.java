package Java8.StreamAPI;
import java.util.Arrays;

public class RemoveDuplicateString {
    public static void main(String[] args){
        String str = "dabcadedfg";
        // str.chars().distinct().mapToObj(x -> (char)x).forEach(System.out::print);

        Arrays.stream(str.split("")).distinct().forEach(System.out::print);
    }
}