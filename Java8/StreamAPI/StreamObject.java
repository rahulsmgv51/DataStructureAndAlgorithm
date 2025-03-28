package Java8.StreamAPI;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamObject {
    public static void main(String[] args){
        /* Stream<Object> emptyStream = Stream.empty();

        emptyStream.forEach(e -> {
            System.out.println(e); 
        }); */

        String names[] = {"Ramesh", "Mukesh", "Jayesh", "Thagesh"};

        Stream<String> streamStr = Stream.of(names);

        streamStr.forEach(e -> {
            System.out.print(e +"  ");
        });

        Stream<Object> streamBuilder = Stream.builder().build();
        IntStream stream = Arrays.stream(new int[] {2, 4, 5 ,6,8});

        stream.forEach(e -> {
            System.out.print(e + " ");
        });

    }
}
