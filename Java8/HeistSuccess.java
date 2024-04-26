package Java8;

public class HeistSuccess {
    public static int isHeistSuccessful(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P' || arr[i] == 'H' || arr[i] == '$') {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == 'I') {
                        break; // Condition 2 violated, move to the next iteration
                    }
if (arr[j] == '$' && (hasPBefore(arr, i, j) && hasHAfter(arr, j) || hasHBefore(arr, i, j) && hasPAfter(arr, j))) {
                        return 1; // Heist successful
                    }
                }
            }
        }
        return 0; // Heist unsuccessful
    }

    // Helper methods to check conditions 1 and 3
    private static boolean hasPBefore(char[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == 'P') {
                return true;
            }
        }
        return false;
    }

    private static boolean hasHAfter(char[] arr, int start) {
        for (int i = start; i < arr.length; i++) {
            if (arr[i] == 'H') {
                return true;
            }
        }
        return false;
    }

    private static boolean hasHBefore(char[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == 'H') {
                return true;
            }
        }
        return false;
    }

    private static boolean hasPAfter(char[] arr, int start) {
        for (int i = start; i < arr.length; i++) {
            if (arr[i] == 'P') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] arr = { 'P', '$', 'I', 'H', 'I', '$', 'P', 'H', 'I', 'P', 'H', 'I', '$', 'H', '$', 'H', 'P' };
        System.out.println(isHeistSuccessful(arr)); // Output: 1 (Successful heist)
    }
}