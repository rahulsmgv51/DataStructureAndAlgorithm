package RecuresionMore;

import java.util.Scanner;

public class CountOccurrencesOfStringInAnotherString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String target = scn.nextLine();
        System.out.println(countString(str, target));
    }

    public static int countString(String str, String targetStr){
        return countOccurrences(str, targetStr, 0);
    }

    public static int countOccurrences(String s, String t, int i){
        if(i > s.length() - t.length()){
            return 0;
        }
        int subProblemAns = countOccurrences(s, t, i+1);
        boolean doStartingCharMatch = s.substring(i, i+t.length()).equals(t);
        if (doStartingCharMatch) {
            return subProblemAns + 1;
        }else{
            return subProblemAns;
        }
    }

}