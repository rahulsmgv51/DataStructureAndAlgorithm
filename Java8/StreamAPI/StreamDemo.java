package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9,2,5,4,1,0,6);

        // Used a lambda expression in the forEach method to print each element.
        // nums.forEach(n -> System.out.println(n));

        // nums.stream()
        //     .filter(n -> n%2==1)
        //     .sorted()
        //     .map(n -> n*2)
        //     .forEach(n -> System.out.println(n));

        Stream<Integer> data = nums.stream();

        Stream<Integer> mappedData = data.map(n -> n*2);
        mappedData.forEach(n -> System.out.println(n));

        // Stream<Integer> sortData = data.sorted();
        // sortData.forEach(n -> System.out.println(n));

        // long count = data.count();
        // System.out.println(count);

        data.forEach(n -> System.out.println(n));

        // stream has already been operated upon or closed
        // data.forEach(n -> System.out.println(n));
    }
}