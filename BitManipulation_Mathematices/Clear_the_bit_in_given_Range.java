package BitManipulation_Mathematices;

public class Clear_the_bit_in_given_Range {

    public static void main(String[] args) {
        System.out.println(clearBitGivenRange(13, 1, 2));
    }

    public static int clearBitGivenRange(int n, int i, int j){
        int a = (~0 << (j+1));
        int b = ((1<<i)-1);
        int mask = a|b;

        return n&mask;
    }
}