package DivideConquer;
import java.util.Scanner;

public class Search {
    public static int SearchIndex(int arr[], int n, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[low] <= arr[mid]) {
            if (target >= arr[low] && target <= arr[mid]) {
                return SearchIndex(arr, n, target, low, mid - 1);
            } else {
                return SearchIndex(arr, n, target, mid + 1, high);
            }
        } else {
            if (target >= arr[mid] && target <= arr[high]) {
                return SearchIndex(arr, n, target, mid + 1, high);
            } else {
                return SearchIndex(arr, n, target, low, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target value:");
        int target = sc.nextInt();

        int result = SearchIndex(arr, n, target, 0, n - 1);

        if (result == -1) {
            System.out.println("Element not found!");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

