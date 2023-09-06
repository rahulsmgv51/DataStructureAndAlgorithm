import java.util.*;

public class GetStairPath {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> al = new ArrayList<>(getStairPaths(n));
        System.out.println(al);
        System.out.println(al.size());
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> js1 = getStairPaths(n - 1);
        ArrayList<String> js2 = getStairPaths(n - 2);
        // ArrayList<String> js3 = getStairPaths(n - 3);
        ArrayList<String> paths = new ArrayList<>();

        for (String string : js1) {
            paths.add(1+string);
        }
        for (String string : js2) {
            paths.add(2+string);
        }
        // for (String string : js3) {
        //     paths.add(3+string);
        // }

        return paths;
    }

}