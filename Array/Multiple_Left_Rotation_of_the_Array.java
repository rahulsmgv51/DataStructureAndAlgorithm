package Array;

class Solution {
    public int[][] multipleLeftRotation(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int ans[][] = new int[m][n];
        int temp[] = new int[2 * n];
        for (int i = 0; i < n; i++) {
            temp[i] = A[i];
            temp[i + n] = A[i];
        }

        for (int i = 0; i < m; i++) {
            int offset = (B[i]) % n;
            for (int j = 0; j < n; j++) {
                ans[i][j] = temp[j + offset];
            }
        }

        return ans;
    }
}

public class Multiple_Left_Rotation_of_the_Array {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 2, 3 };

        Solution solution = new Solution();
        int[][] ans = solution.multipleLeftRotation(A, B);

        for (int[] row : ans) {
            for (int col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}