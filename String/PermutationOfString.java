import java.util.*;
import java.io.*;

class PermutationsOfString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

        }
        out.close();
    }
}

class Solution {
    public List<String> find_permutation(String s){
       HashSet<String> set = new HashSet<>();
       solve(s, "", set);
       List<String> asf = new ArrayList<>(set);
       Collections.sort(asf);
       return asf;
    }
    public void  solve(String str, String asf, HashSet<String> set){
        if (str.length() == 0) {
            set.add(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String qlpart = str.substring(0, i);
            String qrpart = str.substring(i + 1);
            String roq = qlpart + qrpart;
            solve(roq, asf+ch, set);
        }
    }
}