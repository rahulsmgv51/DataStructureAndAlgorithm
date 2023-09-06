public class TimeLimitExeed {
    public static void main(String[] args) {
        int n = 10000000;
        long start = System.currentTimeMillis();
        String s = "";
        for(int i=0; i<n; i++){
            s+=i;
            System.out.println(s);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}
