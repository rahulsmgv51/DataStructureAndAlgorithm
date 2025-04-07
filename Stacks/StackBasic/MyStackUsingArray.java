package Stacks.StackBasic;

public class MyStackUsingArray {
    int capacity;
    int top;
    int[] arr;

    public MyStackUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int ele){
        if(isFull()){
            System.out.println("Stack is overflow !!");
            return;
        }
        top++;
        arr[top] = ele;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow !!");
            return -1;
        }
        int tmp = arr[top];
        top--;
        return tmp;
    }

    public int peek(){
        return arr[top];
    }

    public boolean isFull(){
        return top==capacity-1? true:false;
    }

    public boolean isEmpty(){
        return top==-1? true:false;
    }

    public void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}

class MyStack{
    public static void main(String[] args){
        MyStackUsingArray st = new MyStackUsingArray(5);
        st.push(3); st.push(6);st.push(9);st.push(12);st.push(15);
        st.printStack();
        st.pop();
        st.printStack();
        System.out.println(st.peek());
        st.push(15);
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
    }
}