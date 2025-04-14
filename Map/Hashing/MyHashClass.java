package Map.Hashing;

public class MyHashClass {
    public static void main(String[] args){
        String str = "GOD";
        int hash = 7;
        for(int i=0; i<str.length(); i++){
            hash = hash*31 + str.charAt(i);
        }
        System.out.println("Hash Code value of "+str+ " : "+ hash);
    }
}