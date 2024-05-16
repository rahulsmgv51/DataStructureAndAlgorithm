package BitManipulation_Mathematices;

public class Clear_the_ith_Bit {
    public static void main(String[] args) {
        System.out.println(clearKthBit(13, 2));
    }

    public static int clearKthBit(int N, int K) {
        int mask = ~(1 << K);
        int result = (N & mask);
        return result;
    }
}