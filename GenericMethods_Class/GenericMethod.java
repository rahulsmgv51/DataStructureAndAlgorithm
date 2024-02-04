package GenericMethods_Class;

public class GenericMethod {
    public <E> void printArrays(E[] genericAray){
        for (E e : genericAray) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        String[] countries = new String[]{"India", "USA", "UAE", "UK", "Nepal"};
        Integer[] countriesCode = {91, 92, 93, 94, 96, 84, 78};
        genericMethod.printArrays(countries);
        genericMethod.printArrays(countriesCode);
    }
}
