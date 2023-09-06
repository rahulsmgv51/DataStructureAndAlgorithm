public class StringSplit1 {
    public static void main(String[] args) {
        String str = "@geekss@for@geeksis";
        String arrOfStr[] = str.split("s", 5);

        for (String string : arrOfStr) {
            System.out.println(string);
        }
    }
}
