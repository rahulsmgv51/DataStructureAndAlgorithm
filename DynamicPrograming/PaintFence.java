package DynamicPrograming;

import java.util.Scanner;

public class PaintFence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int noOfFances = scn.nextInt();
        int noOfColor = scn.nextInt();

        int same = noOfColor*1;
        int diff = noOfColor * (noOfColor-1);
        int total = same + diff;

        for(int i=3; i<noOfFances; i++){
            same = diff * 1;
            diff = total * (noOfColor-1);
            total = same + diff;
        }
        System.out.println(total);
    }
}
