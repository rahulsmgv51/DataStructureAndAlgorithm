package List.ArrayList;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainArraylist {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "  -->> "+ list.size());

        // Add in list
        for(int i=10; i<=50; i+=10){
            list.add(i);
        }
        System.out.println(list);
        list.add(2, 100);
        list.set(1, 500);
        System.out.println(list);
        list.remove(4);
        System.out.println( list+ " --- "+ list.size());
        list.add(1000);

        ArrayList<Integer> list1 = new ArrayList<Integer>(3);
        for (int i = 0; i < 17; i++) {
            list1.add(i);
            System.out.format("Size: %2d, Capacity: %2d%n",list1.size(), getCapacity(list1));
        }
    }

    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }
}
