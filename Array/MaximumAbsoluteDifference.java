package Array;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {
    public static int maxArr(ArrayList<Integer> A) {
        assert (!A.isEmpty());

        int maxSum = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); ++i) {
            max1 = Math.max(max1, A.get(i) + i);
            max2 = Math.max(max2, A.get(i) - i);
            min1 = Math.min(min1, A.get(i) + i);
            min2 = Math.min(min2, A.get(i) - i);
        }

        maxSum = Math.max(max1 - min1, max2 - min2);
        return maxSum;
    }

    /*
     * public static int maxArr(ArrayList<Integer> A) {
     * int len = A.size();
     * int aipi[] = new int[len];
     * int aimi[] = new int[len];
     * 
     * for(
     * int i = 0;i<len;i++)
     * {
     * aipi[i] = A.get(i) + i;
     * aimi[i] = A.get(i) - i;
     * }
     * 
     * int minaipi = Integer.MAX_VALUE;
     * int maxaipi = Integer.MIN_VALUE;
     * 
     * int minaimi = Integer.MAX_VALUE;
     * int maxaimi = Integer.MIN_VALUE;
     * 
     * for(
     * int e:aipi)
     * {
     * minaipi = Math.min(minaipi, e);
     * maxaipi = Math.max(maxaipi, e);
     * }
     * 
     * for(
     * int e:aimi)
     * {
     * minaipi = Math.min(minaipi, e);
     * maxaipi = Math.max(maxaipi, e);
     * }
     * 
     * for(
     * int i = 0;i<len;i++)
     * {
     * minaipi = Math.min(minaipi, A.get(i) + i);
     * maxaipi = Math.max(maxaimi, A.get(i) + i);
     * 
     * minaimi = Math.min(minaimi, A.get(i) - i);
     * maxaimi = Math.max(maxaimi, A.get(i) - i);
     * }
     * 
     * int diffaipi = maxaipi - minaipi;
     * int diffaimi = maxaimi - minaimi;
     * 
     * return Math.max(diffaipi,diffaimi);
     * }
     */

    // public int maxArr(ArrayList<Integer> A) {

    // int maxSums=A.get(0);
    // int minSums=A.get(0);
    // for(int i=0;i<A.size();i++) {
    // maxSums=Math.max(maxSums,A.get(i)+i);
    // minSums=Math.min(minSums,A.get(i)+i);
    // }
    // int sumsRes=maxSums-minSums;

    // int maxDif=A.get(0);
    // int minDif=A.get(0);
    // for(int i=0;i<A.size();i++){
    // maxDif=Math.max(maxDif,A.get(i)-i);
    // minDif=Math.min(minDif,A.get(i)-i);
    // }
    // int difsRes=maxDif-minDif;
    // return Math.max(difsRes,sumsRes);
    // }
    // }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(-2);
        A.add(5);
        A.add(-4);
        System.out.println(maxArr(A));
    }
}
