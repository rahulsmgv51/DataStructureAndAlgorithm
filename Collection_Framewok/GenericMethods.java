package Collection_Framewok;

public class GenericMethods {
    public static void main(String[] args) {
        printData("hello my name is rahul");
        printData(123);

        //Call by creating object because  doubleMethods is not define as static
        GenericMethods obj = new GenericMethods();
        obj.doubleData("434");
    }
    //First we need to declare its type by using <E>
    static <E> void printData(E str){
        // System.out.println(str);
        System.out.println("My roll number is : "+ str);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }
}
