package Java_Heap_and_Stack_Memory;

public class MemoryConcept {
    public static void main(String[] args) { // Line 1
        int i = 1; // Line 2
        Object obj = new Object(); // Line 3
        MemoryConcept mem = new MemoryConcept(); // Line 4
        mem.foo(obj); // Line 5
    } // Line 9
    private void foo(Object param) { // Line 6
        String str = param.toString(); // Line 7
        System.out.println(str);
    }// Line 8
}