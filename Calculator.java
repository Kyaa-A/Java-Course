import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int answer = 0;
        
        do{
            System.out.print("Enter operator: ");
            char op = scan.next().trim().charAt(0);
    
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
    
                if (op == '+') {
                    answer = num1 + num2;
                } else if (op == '-') {
                    answer = num1 - num2;
                } else if (op == '*') {
                    answer = num1 * num2;
                } else if (op == '/') {
                    answer = num1 / num2;
                } else if (op == '%') {
                    answer = num1 % num2;
                }
            }else if(op == 'x' || op == 'X'){
                break;
            }else{

            }
            System.out.println(answer);

        }while(true);
    }
}
