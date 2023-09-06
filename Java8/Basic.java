package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(31);
        list.add(32);
        list.add(13);
        list.add(36);
        list.add(34);
        list.add(33);
        list.add(30);
        list.add(35);

        Collections.sort(list);
        System.out.println(list);
        int i = 010;
        int j = 07;
        System.out.println(i);
        System.out.println(j);
    }
}