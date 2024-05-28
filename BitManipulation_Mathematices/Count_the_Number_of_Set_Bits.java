package BitManipulation_Mathematices;

public class Count_the_Number_of_Set_Bits {
    public static int getCountofSetBits(int N) {
        int count = 0;
        while (N != 0) {
            if ((N & 1) != 0) {
                count++;
            }
            N = N >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountofSetBits(9));
    }
}