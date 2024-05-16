package BitManipulation_Mathematices;

public class Set_the_ith_Bit {
    public static void main(String[] args) {
        System.out.println(setKthBit(8, 2));
    }

    public static int setKthBit(int N, int K) {
        int mask = (1 << K);
        int result = (N | mask);
        return result;
    }
}
