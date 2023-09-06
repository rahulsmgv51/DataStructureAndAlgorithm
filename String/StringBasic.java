
import java.io.*;
import java.util.*;

public class StringBasic {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) > 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        String one = A.valueOf(A.charAt(0)).toUpperCase() + A.substring(1);
        String two = B.valueOf(B.charAt(0)).toUpperCase() + B.substring(1);

        System.out.println(one + " " + two  );
        
    }
}