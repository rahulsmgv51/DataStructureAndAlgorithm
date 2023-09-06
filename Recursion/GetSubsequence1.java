import java.util.*;

public class GetSubsequence1 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        LinkedHashSet<String> uniqueStrings = gss(str);
        List<String> asList = new ArrayList<String>(uniqueStrings);
        System.out.println(asList);
    }

    public static LinkedHashSet<String> gss(String str) {
        if (str.length() == 0) {
            LinkedHashSet<String> bres = new LinkedHashSet<String>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        LinkedHashSet<String> rres = gss(ros);

        LinkedHashSet<String> mres = new LinkedHashSet<String>();
        for (String rstr : rres) {
            mres.add("" + rstr);
            mres.add(ch + rstr);
        }
        return mres;
    }

}