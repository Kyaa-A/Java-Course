import java.util.Scanner;

public class FindExisting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[] = { 18, 12, 9, 14, 77, 50 };
        
        System.out.print("Enter a number: ");
        int existing = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (existing == arr[i]) {
                System.out.println("The number " + existing + " exist.");
            }
        }

    }
}