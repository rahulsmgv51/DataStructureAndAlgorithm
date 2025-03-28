package Java8.StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args){
        // filter(Predicate)
        /*  boolean value function
         e-> e>10 */

        
        // map
        /* perform operation on each element 
        */

        // names start with A
        List<String> names = List.of("Aman", "Arun", "Ashish", "Abhishek", "Mangesh", "Kamlesh");
        List<String> namesAlist =  names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(namesAlist);

        names.stream().forEach(
            e -> {
                System.out.print(e);
            }
        );

        names.stream().forEach(System.out::println);

        List<Integer> numbers = List.of(233,54,546,21,121,67,98);
        List<Integer> newNum = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(newNum);

        // sorted

        numbers.stream().sorted().forEach(System.out::println);
        numbers.stream().sorted((a, b) -> (b - a)).forEach(System.out::println);

        // min max

        int minNum = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        int maxNum = numbers.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println("Min Number in List "+ minNum +" max "+ maxNum);

    }
}