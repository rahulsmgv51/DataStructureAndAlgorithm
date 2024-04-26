package Array;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        // list.add(11);
        System.out.println(wave(list));
    }
    public static ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i =0; i<A.size()-1; i=i+2){
            int temp = A.get(i);
            A.set(i, A.get(i+1));
            A.set(i+1, temp);
        }
        return A;
    }
}