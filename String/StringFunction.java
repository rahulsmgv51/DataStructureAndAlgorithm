import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // String s = scn.nextLine();
        // System.out.println(s);
        // System.out.println(s.length());

        // char ch = s.charAt(2);
        // System.out.println(ch);

        String s = "abc def ghi jkl";
        String[] parts = s.split(" ");
        for(int i=0; i<parts.length; i++){
            System.out.println(parts[i]);
        }
    }
}
