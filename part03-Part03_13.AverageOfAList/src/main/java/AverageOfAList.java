
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        
        int sum=0;
        int numbers=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==-1){
                break;
            }
            list.add(input);
            sum=sum+input;
            numbers=numbers+1;
        }
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        double average=1.0*sum/numbers;
        // and prints it.
        System.out.println("Average: " + average);
        
    }
}
