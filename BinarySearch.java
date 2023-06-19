import javax.sound.sampled.SourceDataLine;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = { -18, -11, 4, 9, 23, 63, 91, 104, 234 };
        int target = 104;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //array is sorted in ascending order
        
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}