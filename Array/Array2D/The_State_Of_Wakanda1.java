package Array.Array2D;
import java.util.Scanner;

public class The_State_Of_Wakanda1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<arr[0].length; i++){
            
        }

    }
}
