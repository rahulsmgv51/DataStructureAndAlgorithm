package Basic;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int size = arr.size();
        double negNumbers = 0;
        double posNumbers = 0;
        double numZeros = 0;
        for (int num : arr) {
            if (num < 0) {
                negNumbers++;
            } else if (num > 0) {
                posNumbers++;
            } else {
                numZeros++;
            }
        }
        System.out.println(String.format("%.5f", posNumbers / size));
        System.out.println(String.format("%.5f", negNumbers / size));
        System.out.println(String.format("%.5f", numZeros / size));
    }

}

public class Pricision {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}