import java.util.*;

public class GetMazePath {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        
        ArrayList<String> al = new ArrayList<>(getMazePaths(1, 1, r, c));
        System.out.println(al);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> hori = new ArrayList<>();
        ArrayList<String> vert = new ArrayList<>();
        if(sr < dr){
            hori = getMazePaths(sr+1, sc, dr, dc);
        }
        if(sc < dc){
            vert = getMazePaths(sr, sc+1, dr, dc);
        }
        ArrayList<String> mres = new ArrayList<>();

        for (String geth : hori) {
            mres.add("h"+geth);
        }
        for (String getv : vert) {
            mres.add("v"+getv);
        }
        return mres;
    }

}