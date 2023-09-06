package StringBuilder;

import java.util.Scanner;

public class Basic{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder ssb = new StringBuilder();
        ssb.append(scn.next());
        System.out.println(ssb);
        System.out.println(" Length "+ssb.length());
        System.out.println(" character at specified index "+ ssb.charAt(0));
        ssb.setCharAt(0, 'D');
        System.out.println(" Sets(over-writes) the character at specified index as content of ch "+ssb);
        ssb.deleteCharAt(ssb.length()-1);
        System.out.println(" Deletes a character at the specified index "+ ssb);
        ssb.delete(0, 1);
        System.out.println(" Deletes the substring contained between the start and end index. "+ ssb);
        ssb.replace(0,2, "FLY");
        System.out.println("Replaces the substring contained between start and end index with the specified string str. "+ ssb);
        ssb.toString();
        System.out.println(ssb);

    }
}