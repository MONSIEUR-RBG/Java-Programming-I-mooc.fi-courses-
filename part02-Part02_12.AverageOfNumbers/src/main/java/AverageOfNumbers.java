
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int sumOfNumbers=0;
        while(true){
            System.out.println("Give a number:");
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput==0){
                break;
            }else{
                sumOfNumbers = sumOfNumbers + userInput;
                numbers = numbers +1;
            }
            
        }
        double average= 1.0*sumOfNumbers/numbers;
        System.out.println("Average of the numbers: " + average);
    }
}
