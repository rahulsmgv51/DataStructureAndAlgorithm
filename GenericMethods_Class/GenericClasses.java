package GenericMethods_Class;

class MyData<E> {
	E i;

	public void add(E i1) {
		i = i1;
	}

	public E get() {
		return i;
	}
}

public class GenericClasses {
	public static void main(String[] args) {
		MyData<String> m1 = new MyData<String>();
		MyData<Integer> m2 = new MyData<Integer>();
		Integer k = new Integer(5);
		m2.add(k);
		m1.add("Rahulkvishwakrma");
		System.out.println("m1 String: "+m1.get());
		System.out.println("m2 Integer: "+m2.get());
	}
}