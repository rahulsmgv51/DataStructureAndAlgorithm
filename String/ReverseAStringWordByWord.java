import java.util.Scanner;

public class ReverseAStringWordByWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
 
        ReverseAStringWordByWord obj = new ReverseAStringWordByWord();
        System.out.println(obj.reverseWords(str));

    }

    public String reverseWords(String s) {
        int i = s.length() - 1;
        String newStr = "";

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int j = i;

            if (i < 0)
                break;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if (newStr.isEmpty()) {
                newStr = newStr.concat(s.substring(i + 1, j + 1));
            } else {
                newStr = newStr.concat(" " + s.substring(i + 1, j + 1));
            }
        }

        return newStr;
    }

}
