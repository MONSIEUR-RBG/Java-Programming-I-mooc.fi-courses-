
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("Give the first number:");
int firstInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondInput = Integer.valueOf(scanner.nextLine());
        double averageResult = 1.0 * (firstInput+secondInput) / 2;
        
        System.out.println("The average is " + averageResult);
    }
}
