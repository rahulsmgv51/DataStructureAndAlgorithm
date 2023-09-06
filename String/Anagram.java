public class Anagram {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "jnnmaav";

        boolean isAnagram = false;

        for(int i=0; i<s1.length(); i++){
            isAnagram = false;
            char ch = Character.toLowerCase(s1.charAt(i));
            for(int j =0 ; j<s2.length(); j++){
                if(Character.toLowerCase(s2.charAt(j)) == ch){
                    isAnagram = true;
                }
                else{
                    isAnagram = false;
                }
            }

            if(! isAnagram){
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        
    }
}
