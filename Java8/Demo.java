package Java8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;




// class Solution {
//     public static int nCr(int n, int r) {
//         if (n == r || r == 0)
//             return 1;

//         return nCr(n - 1, r - 1) + nCr(n - 1, r);
//     }
// }

public class Demo {
    // public static int x =10;
    // public static void myFunction(){
    // x =15;
    // }

    // public static List<String> findSubstrings(String s) {
    // List<String> acList = findSubstringsHelper(s);
    // acList.remove(acList.size()-1);
    // return acList;
    // }

    // public static List<String> findSubstringsHelper(String s) {
    // if (s.length() == 0) {
    // List<String> bcase = new ArrayList<>();
    // bcase.add(s);
    // return bcase;
    // }
    // char ch = s.charAt(0);
    // String rofs = s.substring(1);
    // List<String> ans = findSubstringsHelper(rofs);
    // List<String> myres = new ArrayList<>();
    // for (String c : ans) {
    // myres.add(ch + c);
    // myres.add("" + c);
    // }
    // return myres;
    // }

    // public static boolean isArraySorted(int[] arr, int idx, int n){
    // if (idx==n && arr[idx-1] > arr[idx-2]) {
    // return true;
    // }

    // if (arr[idx]> arr[idx-1]) {
    // isArraySorted(arr, idx+1, n);
    // return true;
    // }
    // else{
    // return false;
    // }
    // }

    // public static void myFun(){
    // System.out.println(x);
    // }

    public static double myPow(double x, int n, int p) {
        if(n == 0){
            return 1;
        }
        double xpbn2 = myPow(x, n/2, p);
        double xn = xpbn2 * xpbn2;
        if(n%2 != 0){
            xn = xn * x;
        }

        return xn%p;
    }

    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(new Long(10));
        s.add(new Integer(10));

        for (Object object : s) {
            System.out.println("test - "+ object);
        }

        // double x = 2.00000;
        // int n = -2;
        // int p = 1;
        // System.out.println(myPow(n<0?1/x: x, Math.abs(n), p));
        // int x =10;
        // myFun();
        // int[][] matrix = new int[3][2];
        // System.out.println(matrix[1]);
        // int value =1;
        // for(int i=0; i<matrix.length; i++){
        // for(int j=0; j<matrix.length; j++){
        // matrix[i][j] = value;
        // value++;
        // }
        // }

        // int sum = 0;
        // for (int[] row : matrix) {
        // for (int col : row) {
        // sum += col;
        // }
        // }
        // System.out.println(sum);
        // int[] arr1 = {1,2,3};
        // int[] arr2 = {1,2,3};
        // System.out.println(arr1==arr2);

        // int[][] arr = {{1,2,3}, {4,5}, {6,7,8,9}};
        // System.err.println(arr[1].length);
        // int[3,4,2] cube;
        // int[][][] cube;
        // int[,,,] cube = new int[2,3,4];
        // int[,,,] cube;

        // int cube1[][][] = new int[1][2][2];
        // System.out.println(isArraySorted(arr, 1, 5));

        // int j=20;
        // do{
        // j-=5;
        // }while(j>0);

        // System.out.println(findSubstrings("abc"));
        // System.out.println(7%3);
        // int month = 3;
        // String season;
        // switch (month){
        // case 12:
        // case 1:
        // case 2:
        // season = "Winter";
        // break;
        // case 3:
        // case 4:
        // case 5:
        // season = "Spring";
        // break;
        // case 6:
        // case 7:
        // case 8:
        // season = "Summer";
        // break;
        // case 9:
        // case 10:
        // case 11:
        // season = "Autumn";
        // break;
        // default:
        // season = "Invalid month";
        // }

        // System.out.println(season);
        // for(int i=1; i<=3; i++){
        // for(int j=1; j<=3; j++){
        // if (i+j == 4) {
        // continue;
        // }
        // System.out.println(i+j+" ");
        // }
        // }
        // int a=10;
        // double y = 3.5;
        // System.out.println(y/x);
        // if (a==9)
        // System.out.println("ok ");
        // System.out.println("master ");
        // else
        // System.out.println("Bye ");
        // for(x=0; x<10; x++){
        // if (x%2 == 0) {
        // continue;
        // }
        // System.out.println(x);
        // }

        // x =5;
        // {
        // int y = 6;
        // System.out.println(x + "" +y);
        // }
        // System.out.println(x+""+y);
        // String str = "Hello, World!";
        // System.out.println(str.substring(7,12));
        // int x = 10;
        // System.out.println(x + " ");
        // myFunction();
        // System.out.println(x + " ");
        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        // int target = 5;
        // boolean found = false;
        // for(int i=0; i<matrix.length; i++){
        // for(int j=0; j<matrix[i].length; j++){
        // if(matrix[i][j] == target){
        // found = true;
        // break;
        // }
        // }
        // if (found) {
        // break;
        // }
        // }
        // System.out.println(found);
        // String str = "Java";
        // System.out.println(str.contains(null));
        // Solution obj = new Solution();
        // System.out.println(obj.nCr(20, 10));
        // String str = "Java";
        // System.out.println(str.contains(""));
        // String[] words = str.split("a");
        // System.out.println(words.length);
        // String str = new String("Java");
        // String str1 = new String("Java");
        // System.out.println(str == str1);
        // System.out.println(str.contains(" World ")+" ");
        // System.out.println(str.isEmpty());
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // System.out.println(nthFibonacci(n));
    }

    // public static int nthFibonacci(int n) {
    // int a = 0;
    // int b = 1;
    // int nthFibonacciVal = a+b;
    // for(int i=1; i<n; i++){
    // nthFibonacciVal = a+b;
    // a=b;
    // b=nthFibonacciVal;
    // }
    // return nthFibonacciVal;
    // }
}