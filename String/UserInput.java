import java.util.*;

public class UserInput{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // String s1 = scn.next();
        // String s2 = scn.next();
        /* input => abc def
          output => String s1 abc
                    String s2 def */
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        /* abc def
        ghi jkl
        String s1 abc def
        String s2 ghi jkl */
        System.out.println("String s1 "+ s1);
        System.out.println("String s2 "+ s2);
        
    }
}