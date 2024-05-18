package BitManipulation_Mathematices;

public class BinarytoDecimal {
    public static int toDecimal(String str) {
        if (str.length() == 1 && str.equals("1")) {
            return 1;
        }
        int i = 0, j = str.length() - 1, sum = 0;
        while (j >= 0) {
            String digit = str.charAt(j) + "";
            sum = sum + Integer.parseInt(digit) * 2 << i;
            j--;
        }
        return sum;
    }

    public static int toDecimal_2nd(String str) {
        int dec = 0;
        for (int i = 0; i < str.length(); i++) {
            dec = dec << 1;
            dec = dec | str.charAt(i) - '0'; // Use '0' to convert the character to an integer
        }
        return dec;
    }

    public static void main(String[] args) {
        // System.out.println(toDecimal("1"));
        System.out.println(toDecimal_2nd("10001"));
    }
}