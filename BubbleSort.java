import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* int arr[] = { 3, 2, 1, 5, 4 }; */
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // if ascending change > to <
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
