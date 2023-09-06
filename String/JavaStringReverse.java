import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int i = 0;
        int j = A.length() - 1;
        boolean flag = true;

        while (i <= j) {
            if (A.charAt(i) != A.charAt(j)) {
                flag = false;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
