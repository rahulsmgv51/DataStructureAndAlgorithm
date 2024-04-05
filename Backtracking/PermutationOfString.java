package Backtracking;

import java.util.TreeSet;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "ABC";
        TreeSet<String> res = new TreeSet<>();
        System.out.println(permute(str, "", res));
    }

    public static TreeSet<String> permute(String str, String psf, TreeSet<String> res) {
        if(str.length() == 0){
            res.add(psf);
            return res;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String restofString1 = str.substring(0, i);
            String restofString2 = str.substring(i+1);
            String restoString = restofString1+restofString2;
            permute(restoString, psf+ch, res);
        }

        return res;
    }
}
