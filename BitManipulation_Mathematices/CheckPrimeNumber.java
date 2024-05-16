package BitManipulation_Mathematices;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }

    public static int isPrime(int n) {
        if (n <= 1)
            return 0;

        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return 0;

        return 1;
    }
}