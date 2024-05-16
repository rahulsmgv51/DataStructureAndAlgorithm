package BitManipulation_Mathematices;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b = 11;

        System.out.println(a|b);
        System.out.println(a&b);
        System.out.println(a^b);

        byte c = 0;
        byte d = (byte) ~c;
        System.out.println(d);

        int e = 2;
        int f = e<<1;
        System.out.println(f);
    }
}
