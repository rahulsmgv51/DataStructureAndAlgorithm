package Advanced_Sorting_Algorithms_And_Greedy_Programming;

public class Partition_in_Array {

    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i=low, j=low;
        while (i<=high) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j-1;
    }

   /*  public static int partition(int arr[], int pivot) {
        int low = 0;
        int high = 0;
        while (high < arr.length) {
            if (arr[high] > pivot) {
                high++;
            } else {
                swap(arr, low, high);
                low++;
                high++;
            }
        }
        return low - 1;

    } */

    public static void swap(int arr[], int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 4, 8, 3, 6, 2, 5};
        // System.out.println( partition(arr, pivot));
        System.out.println(partition(arr, 0, arr.length-1));
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}