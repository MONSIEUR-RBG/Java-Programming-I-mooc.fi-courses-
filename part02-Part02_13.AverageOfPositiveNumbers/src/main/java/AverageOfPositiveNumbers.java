
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positiveNumbers = 0;
        int numbers=0;
        while(true){
            System.out.println("");
            int userInput=Integer.valueOf(scanner.nextLine());
            if(userInput==0){
                break;
            }else if (userInput>0){
                positiveNumbers=positiveNumbers + userInput;
                numbers = numbers + 1;
            }
        
        }
        if (numbers >0){
            double average = 1.0*positiveNumbers/numbers;
            System.out.println(average);
        }else{
            System.out.println("Cannot calculate the average");
        }
        
    }
}
