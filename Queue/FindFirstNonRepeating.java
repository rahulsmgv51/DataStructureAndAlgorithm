package Queue;

import java.util.*;

public class FindFirstNonRepeating {

	public static String FirstNonRepeating_SecondMethod(String A) {
		// ans string stores the final answer
		String ans = "";

		// map to find uniqueness of an element
		Map<Character, Integer> mp = new HashMap<>();
		Queue<Character> q = new LinkedList<>();

		// queue to keep non-repeating element at the front.
		for (int i = 0; i < A.length(); i++) {

			// if non-repeating element found push it in
			// queue and count in map
			if (!mp.containsKey(A.charAt(i))) {
				q.add(A.charAt(i));
			}
			mp.put(A.charAt(i), mp.getOrDefault(A.charAt(i), 0) + 1);

			// if anytime front element is repeating pop it
			// form queue
			while (!q.isEmpty() && (mp.get(q.peek()) > 1)) {
				q.remove();
			}

			// if queue is not empty append front element
			// else append "#" in ans string.
			if (!q.isEmpty()) {
				ans += q.peek();
			} else {
				ans += '#';
			}
		}
		// return ans
		return ans;
	}

	public static String FirstNonRepeating(String s) {
		int[] frequency = new int[26];
		Queue<Character> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			q.offer(c); // insert element into queue
			frequency[c - 'a']++;

			while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
				q.poll();
			}

			if (q.isEmpty()) {
				sb.append('#');
			} else {
				sb.append(q.peek());
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String s = "abacbcbd";
		System.out.println(FirstNonRepeating_SecondMethod(s));
	}
}