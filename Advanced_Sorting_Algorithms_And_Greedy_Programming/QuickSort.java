package Advanced_Sorting_Algorithms_And_Greedy_Programming;

public class QuickSort {
    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int pi = partition(arr, low, high);
        System.out.println(pi + " pi");
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low, j = low;
        while (i <= high) {
            if (arr[i] > pivot) {
                i++;
            } else {
                swap(arr, i, j);
                j++;
                i++;
            }
        }
        return j - 1;
    }

    public static void swap(int arr[], int low, int high) {
        System.out.println("Swapping " + arr[low] + " and " + arr[high]);
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 4, 8, 3, 6, 2, 1 };
        quickSort(arr, 0, arr.length - 1);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}