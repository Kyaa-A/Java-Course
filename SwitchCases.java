import java.util.Scanner;

public class SwitchCases{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("It's Monday");
            case "Tuesday" -> System.out.println("It's Tuesday");
            case "Wednesday" -> System.out.println("It's Wednesday");
            case "Thursday" -> System.out.println("It's Thursday");
            case "Friday" -> System.out.println("It's Friday");
            case "Saturday" -> System.out.println("It's Saturday");
            case "Sunday" -> System.out.println("It's Sunday");
            default -> System.out.println("Incorrect Input");
        }

    }
}