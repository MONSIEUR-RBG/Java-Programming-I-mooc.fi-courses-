
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int secondInput = Integer.valueOf(scanner.nextLine());
        
        //Addition
        System.out.println(firstInput + " + " + secondInput + " = " + (firstInput+secondInput));
        
        //Substration
        System.out.println(firstInput + " - " + secondInput + " = " + (firstInput-secondInput));
        
        //Multiplication
        System.out.println(firstInput + " * " + secondInput + " = " + (firstInput*secondInput));
        
        //Division
        System.out.println(firstInput + " / " + secondInput + " = " + (1.0*firstInput/secondInput));
        
        
        

    }
}
