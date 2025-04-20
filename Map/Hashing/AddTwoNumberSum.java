package Map.Hashing;
import java.util.HashSet;

public class AddTwoNumberSum {
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 3, 6, 5};
        int target = 8;
        System.out.println(twoSum(arr, target));
    }

    public static boolean twoSum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int ele: arr){
            set.add(ele);
        }

        for(int ele: arr){
            int com = target - ele;
            if(set.contains(com)){
                return true;
            }
            // set.add(ele);
        }

        return false;
    }
}
