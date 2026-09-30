
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input==9999){
                break;
            }
            list.add(input);
        }
        
        // after that, the program prints the smallest number
        int minNumber=list.get(0);
        for(int min :list){
            if(min<minNumber){
                minNumber=min;
            }
        }
        System.out.println("Smallest number: " + minNumber);

        // and its index -- the smallest number
        boolean found = false;
        for(int i =0; i<list.size();i++){
            if(list.get(i)==minNumber){
                int index =i;
                System.out.println("Found at index: " + index);
                found= true; //Notice that we find an occurence
            }
        }
        // might appear multiple times
        
    }
}
