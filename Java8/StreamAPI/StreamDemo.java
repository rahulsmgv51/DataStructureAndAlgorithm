package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        // Imperative approach
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum =0 ;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                sum += arr[i];
            }
        }

        // Stream
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        IntStream sum2 = Arrays.stream(arr2).filter(n -> n%2 == 0);

        // Convert collection Into Stream
        List<String> list = Arrays.asList("book", "notebook", "pen", "pencil");
        Stream<String> streamStr =   list.stream();

        // Convert array Into Stream
        String[] array = {"book", "notebook", "pen", "pencil"};
        Stream<String> streamArr = Arrays.stream(array);

        // Create Stream of Integer
        Stream<Integer> streamInt = Stream.of(1,2,3,4);
        //anotherway to create stream
        Stream<Integer> streamLimit = Stream.iterate(0, n -> n+1).limit(10);

        List<Integer> listNum = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
        List<Integer> fliterEvenList = listNum.stream()
                                              .filter(x -> x % 2 == 0)
                                              .map(x -> x / 2)
                                              .distinct()
                                              .sorted((a, b) -> (b - a)) //(a, b) -> (a - b) ascending order | (a, b) -> (b - a) descending order 
                                              .limit(6)
                                              .skip(1)
                                              .collect(Collectors.toList());
        System.out.println("Filter List " +fliterEvenList);

        List<Integer> collectInt = Stream.iterate(0, x -> x+1)
                                         .limit(25)
                                         .skip(1)
                                         .filter(x -> x % 2 == 0)
                                         .map(x -> x /10)
                                         .distinct()
                                         .sorted()
                                         .peek(x -> System.out.println(x))
                                         .collect(Collectors.toList());
        System.out.println(collectInt);


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

        // data.forEach(n -> System.out.println(n));

        // stream has already been operated upon or closed
        // data.forEach(n -> System.out.println(n));
    }
}