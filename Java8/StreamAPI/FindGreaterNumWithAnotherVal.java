package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindGreaterNumWithAnotherVal {
    public static void main(String[] args){
        List<Integer>  list = Arrays.asList(3,2,5,7,6,8,1,9,4);
        List<Integer> listNumber = list.stream().filter(x -> x>=5).peek(x -> System.out.print(x +" ")).collect(Collectors.toList());
        // System.out.print(listNumber);
    }
}
