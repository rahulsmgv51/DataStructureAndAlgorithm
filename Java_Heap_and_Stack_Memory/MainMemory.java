package Java_Heap_and_Stack_Memory;

public class MainMemory {
    public static void main(String[] args) {
        int a =5; // define in stack area.
        //primitive data type define in stack area.
        Integer b = 5; // also create in stack area due to auto-boxing.
    
        Data obj = new Data();
        obj.data = 5;

        changeValue(a, obj);
        System.out.println(a); 
        // o/p = 5 because a is primitive data type so it define in stack and 
        // changeValue() create in heap area.

        System.out.println(obj.data); // op: 20
        // Value change due to when we create object then referance store in stack and its value store in heap area.
        // Now call the changeValue function then we create again new object and this object  ref. to already created data's value. 
        //so change the value of data from 5 to 20.

    }

    static void changeValue(int a, Data oData){
        a=10;
        oData.data = 20;
    }
}

class Data{
    int data;
}