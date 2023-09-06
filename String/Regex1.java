public class Regex1 {
    public static void main(String[] args) {
        // String str = "GeeksforGeeks:A.Computer.Science Portal";
        // String[] arrOfStr = str.split(":");
        // String[] arrOfStr = str.split("for");
        // String[] arrOfStr = str.split("[.]");
        // String[] arrOfStr = str.split(" ");
        String str = "word1, word2 word3@word4?word5.word6";
        String[] arrOfStr = str.split("[, ?.@]+");

        for (String a : arrOfStr)
            System.out.println(a);
    }
}
