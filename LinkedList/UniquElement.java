package LinkedList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class UniquElement {
    public static void main(String[] args) {
        LinkedHashSet<String> uniqueStrings = new LinkedHashSet<String>();

        uniqueStrings.add("A");
        uniqueStrings.add("B");
        uniqueStrings.add("B");
        uniqueStrings.add("C");
        uniqueStrings.add("A");

        List<String> asList = new ArrayList<String>(uniqueStrings);
        System.out.println(asList);
    }
}
