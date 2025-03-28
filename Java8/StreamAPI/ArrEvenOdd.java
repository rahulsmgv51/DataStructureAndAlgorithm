package Java8.StreamAPI;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class ArrEvenOdd {
    public static void main(String[] args){
        // List<Integer> list = List.of(3,2,5,7,6,8,1,9); //Immutable
        List<Integer>  list = Arrays.asList(3,2,5,7,6,8,1,9,4); //Immutable
        List<Integer> oddList = list.stream().filter(x -> x%2 != 0).collect(Collectors.toList());
        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.print(oddList+" === "+evenList);

        
    }
}
