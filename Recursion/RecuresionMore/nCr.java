package RecuresionMore;

public class nCr {
    public static void main(String[] args) {
        System.out.println(find_nCr(5, 2));
    }

    public static int find_nCr(int n, int r){
        if(n < r){
            return 0;
        }
        if(n==r || r==0){
            return 1;
        }
        return find_nCr(n-1, r-1)+ find_nCr(n-1, r);
    }
}