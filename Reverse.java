import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answer = 0;

        int num = scan.nextInt(); //Example input: 12345 output: 54321

        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            answer = answer * 10 + rem;
        }

        System.out.println(answer);
    }
}
