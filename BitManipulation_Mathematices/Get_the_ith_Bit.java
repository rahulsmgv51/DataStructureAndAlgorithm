package BitManipulation_Mathematices;

public class Get_the_ith_Bit {
    public static void main(String[] args) {
        System.out.println(getKthBit(2, 1));
    }

    // public static int getKthBit(int N, int K) {
    //     int mask = 1 << K;
    //     int result = (N & mask);
    //     return (result == 0) ? 0 : 1;
    // }

    public static boolean getKthBit(int N, int K) {
        return ((1 << K) & N) != 0;
    }
}