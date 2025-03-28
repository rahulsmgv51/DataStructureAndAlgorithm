package Java8.StreamAPI;
import java.util.Arrays;
import java.util.Comparator;

public class HighestLengthString {
    public static void main(String args[]){
        String str =  "I am Learning Streams API in java";
        String maxStr = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(maxStr);
    }
}
