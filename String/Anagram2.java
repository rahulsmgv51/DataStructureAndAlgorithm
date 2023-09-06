public class Anagram2 {
    public static void main(String[] args) {
        String a = "Java";
        String b = "aavJ";

        int alph[] = new int[265];

        for (int i : a.toCharArray()) {
            alph[i]++;
        }
        for (int i : b.toCharArray()) {
            alph[i]++;
        }

        boolean f = true;
        for (int i : alph) {
            if(i%2 != 0){
                f = false;
            }
        }

        if(f){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
