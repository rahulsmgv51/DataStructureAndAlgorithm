package RecuresionMore;

public class FibonacciNumber {
	public static void main(String[] args) {
		int n = 0;
		System.out.println(fibonacciNo(n));
	}
	public static int fibonacciNo(int n) {
        if (n<=1) {
            return n;
        }
		return fibonacciNo(n-1) + fibonacciNo(n-2);
	}
}
