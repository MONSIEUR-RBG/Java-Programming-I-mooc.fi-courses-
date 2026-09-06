
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int firstInput = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        int secondInput = Integer.valueOf(scanner.nextLine());
        
        double square = Math.sqrt(firstInput + secondInput);
        
        System.out.println(square);
    }
}
