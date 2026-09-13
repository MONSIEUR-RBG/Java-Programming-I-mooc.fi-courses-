
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sumOfNumbers =0;
        
        while(true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput==0){
                break;
            }else{
                sumOfNumbers=sumOfNumbers + userInput;
                numbers = numbers +1;
            }
        }
        System.out.println("Number of numbers: " + numbers);
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
