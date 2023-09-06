public class SplitToken {

    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        // String[] splitted = s.split("[\\W]+");
        // System.out.println(splitted.length);
        // for(String enterNewLine: splitted){
        //     System.out.println(enterNewLine);
        // }
        
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println("0");
        } else {
            String[] output = s.split("[ !,?._'@]+");
            System.out.println(output.length);
            for (String part : output) {
                System.out.println(part);
            }
        }
    }
}