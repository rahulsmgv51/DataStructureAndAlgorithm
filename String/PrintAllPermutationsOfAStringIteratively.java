import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPermutationsOfAStringIteratively {
    public static List<String> solution(String str) {
        int n = str.length();
        int f = factorial(n);
        List<String> list = new ArrayList<>();
        // System.out.println("Fact"+ f);
        
        for(int i=0; i<f; i++){
            StringBuilder sb = new StringBuilder(str);
            StringBuilder s1 = new StringBuilder();
            int tmp = i;
            for(int div = n; div>=1; div--){
                int rem = tmp%div;
                tmp = tmp/div;
                // System.out.print(sb.charAt(rem));
                s1.append(sb.charAt(rem));
                sb.deleteCharAt(rem);
            }
            // System.out.println();
            list.add(s1.toString());
        }
        return list;
    }

    public static int factorial(int n){
        int val = 1;
        for(int i=2; i<=n; i++){
            val*=i;
        }
        return val;
    }

    public static void permutationsOfStringWithRecursion(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String qlpart = str.substring(0, i);
            String qrpart = str.substring(i+1);
            String roq = qlpart+qrpart;
            permutationsOfStringWithRecursion(roq, asf+ch);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        // System.out.println(solution(str));
        permutationsOfStringWithRecursion(str, "");
    }

}
