package Java8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfArr {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 6, 2, 7, 8, 5, 9);
        int countofNum = (int) numbers.stream().count();
        Integer sumNum = numbers.stream().reduce(0, (a, b) -> a + b);
        int sumOfNum = numbers.stream().collect(Collectors.summingInt(Integer :: intValue));
        System.out.print(" Num of Count: " + countofNum + " Sum of Num -> " + sumNum + " Sum Of Num in another method :  " + sumOfNum);
    }
}
