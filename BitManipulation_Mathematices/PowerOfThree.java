package BitManipulation_Mathematices;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(8));
    }
    public static boolean isPowerOfThree(int n) {
		if (n <= 0) return false;
		while (n % 3 == 0) {
			n = n/3;
		}
		return n == 1;
	}
}
