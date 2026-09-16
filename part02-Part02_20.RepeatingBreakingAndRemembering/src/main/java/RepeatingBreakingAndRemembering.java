
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int numbers =0;
        double average =0;
        int even=0;
        int odd=0;
        System.out.println("Give numbers:");
        while(true){
            
            int userInput=Integer.valueOf(scanner.nextLine());
            
            if(userInput==-1){
               // System.out.println("Give numbers:");
                System.out.println("Thx! Bye!");
                break;
            }
            if(userInput%2==0){
                even=even+1;
            }else{
                odd = odd +1;
            }
            sumOfNumbers=sumOfNumbers+userInput;
            numbers=numbers+1;
            average=1.0*sumOfNumbers/numbers;
            
        }
        System.out.println("Sum:" + sumOfNumbers);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
