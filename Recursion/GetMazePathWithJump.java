import java.util.*;

public class GetMazePathWithJump {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();

        ArrayList<String> al = new ArrayList<>(getMazePaths(1, 1, r, c));
        System.out.println(al);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> mres = new ArrayList<>();

        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = getMazePaths(sr, sc + ms, dr, dc);
            for (String str : hpaths) {
                mres.add("h"+ms+str);
            }
        }
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = getMazePaths(sr + ms, sc, dr, dc);
            for (String str : vpaths) {
                mres.add("v"+ms+str);
            }
        }
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            ArrayList<String> dpaths = getMazePaths(sr + ms, sc + ms, dr, dc);
            for (String str : dpaths) {
                mres.add("d"+ms+str);
            }
        } 

        return mres;
    }

}