package Collection_Framewok;

public class GenericMethods {
    public static void main(String[] args) {
        printData("Hello my name is RAHUL");
        printData(10);

        //Call by creating object because  doubleMethods is not define as static
        GenericMethods obj = new GenericMethods();
        // obj.doubleData(10);
        obj.doubleData("434");
        //we can not pass string data only pass number
        // obj.doubleTypeData("43543543");
        obj.doubleTypeData(6767);
    }
    //First we need to declare its type by using <E>
    static <E> void printData(E str){
        // System.out.println(str);
        System.out.println("My roll number is : "+ str);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }

    //Bounded Generic Types

    <E extends Number> void doubleTypeData(E data){
        System.out.println(data);
    }
}
