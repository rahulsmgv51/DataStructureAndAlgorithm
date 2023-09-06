import java.io.InputStream;
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1d = scn.nextInt();
        int t2d = scn.nextInt();
        int t3d = scn.nextInt();
        toh(n, t1d, t2d, t3d);
        System.out.println(toh1(n, t1d, t2d, t3d));
    }

    private static void toh(int n, int t1d, int t2d, int t3d) {
        if (n == 0) {
            return;
        }
        toh(n - 1, t1d, t3d, t2d);
        System.out.println(n + "[" + t1d + " -> " + t2d + "]");
        toh(n - 1, t2d, t3d, t1d);
    }

    public static long toh1(int N, int from, int to, int aux) {
        long moves = 0L;
        if (N >= 1) {
            // recursive call to move top disk from "from" to aux in current call
            moves += toh1(N - 1, from, aux, to);
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);

            // increment moves
            moves++;

            // recursive call to move top disk from aux to "to" in current call
            moves += toh1(N - 1, aux, to, from);
        }
        return moves;
    }
}
