import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //=====IF AND ELSE METHOD=====
        /* int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int largest = 0;

        if (a > b) {
            if (a > c) {
                largest = a;
                System.out.print("A is largest : " + largest);
            }
        } else if (b > c) {
            largest = b;
            System.out.println("B is largest: " + largest);
        } else {
            largest = c;
            System.out.println("C is largest: " + largest);
        } */


        //=====ARRAY METHOD=====
       /*  int largest[] = new int[3];
        int result = 0;
        for (int i = 0; i < largest.length; i++) {
            largest[i] = scan.nextInt();
        }

        for (int i = 0; i < largest.length; i++) {
            if (result < largest[i]){
                result = largest[i];
            }
        }
    
        System.out.println("Largest : " + result); */

        //=====MATH METHOD=====
        /* int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int result = Math.max(a, Math.max(b,c));  //3 value
        System.out.println("Max: " + result); */
    }
}