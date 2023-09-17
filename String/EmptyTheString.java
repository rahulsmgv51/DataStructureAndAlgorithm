import java.io.*;
import java.util.*;

public class EmptyTheString {
    static int makeStringEmpty(String s) {
        char a, b, c, d;
        Stack<Character> st = new Stack<Character>();

        // If length of the string is not a multiple of 4,
        // it can never be emptied.
        if (s.length() % 4 != 0)
            return -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'k') {
                if (st.size() >= 3) {
                    a = st.peek();
                    st.pop();
                    b = st.peek();
                    st.pop();
                    c = st.peek();
                    st.pop();
                    if (!(a == 'e' && b == 'e' && c == 'g')) {
                        st.add(c);
                        st.add(b);
                        st.add(a);
                        st.add('k');
                    }
                } else {
                    st.add('k');
                }
            } else {
                st.add(s.charAt(i));
            }
        }

        int flag = 1;

        while (st.size() >= 3) {
            a = st.peek();
            st.pop();
            b = st.peek();
            st.pop();
            c = st.peek();
            st.pop();
            d = st.peek();
            st.pop();
            if (!(a == 'k' && b == 'e' && c == 'e' && d == 'g')) {
                flag = 0;
                break;
            }
        }

        if (flag != 0)
            return s.length() / 4;
        else
            return -1;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            System.out.println(makeStringEmpty(s));
        }
    }
}