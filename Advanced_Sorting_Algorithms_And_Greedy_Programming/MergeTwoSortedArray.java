package Advanced_Sorting_Algorithms_And_Greedy_Programming;

public class MergeTwoSortedArray {
    public static void merge(int arr[], int l, int m, int h) {
        // Length of first half array
        int n1 = m - l;
        int a[] = new int[n1];
        for (int i = 0; i < m; i++) {
            a[i] = arr[i];
        }

        // Length of second half array
        int n2 = h - m;
        int b[] = new int[n2];
        for (int i = m; i < h; i++) {
            b[i-m] = arr[i];
        }

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k] = a[i];
                i++;
            } else {
                arr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i<a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }

        while (j<b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,3,5,7,9,2,2,2,2,2,4,6,8,10};
        int l = 0, h=arr.length;
        int m = (l+h)/2;
        merge(arr, 0, m, h);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}