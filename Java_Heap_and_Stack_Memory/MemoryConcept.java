package Java_Heap_and_Stack_Memory;

public class MemoryConcept {
    public static void main(String[] args) {
        int i = 1; // i value store in stack
        Object obj = new Object(); // object reference store in stack and create in heap memory. and call from anywhere if its reference are store.
        MemoryConcept mem = new MemoryConcept();
        mem.foo(obj); // 
    }
    private void foo(Object param) {
        String str = param.toString(); // String are store in string pool area and which is store in heap area.
        System.out.println(str);
    }
}