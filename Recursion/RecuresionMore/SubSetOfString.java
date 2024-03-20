package RecuresionMore;

import java.util.*;

public class SubSetOfString {
    public static TreeSet<String> result = new TreeSet();
    public static List<String> printAllSubset(String str) {
        
        printAllSubset(str, 0, "");
        List<String> aList = new ArrayList<>();
        aList.addAll(result);
        result.removeAll(aList);
        return aList;
    }

    public static void printAllSubset(String str, int i, String currentStr) {
        if (currentStr.length() > 0) {
            result.add(currentStr);
        }
        if (i == str.length()) {
            return;
        }
        printAllSubset(str, i+1, currentStr+str.charAt(i));
        printAllSubset(str, i+1, currentStr);
    }


    public static void main(String[] args) {
        System.out.println(printAllSubset("abcd"));
    }
}