
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int userInput = Integer.valueOf(scan.nextLine());
        
        if(userInput<0){
            System.out.println("impossible!");
        }else if (userInput<=49){
            System.out.println("failed");
        }else if (userInput>=50 && userInput<=59){
            System.out.println("1");
        }else if (userInput>=60 && userInput<=69){
            System.out.println("2");
        }else if (userInput>=70 && userInput<=79){
            System.out.println("3");
        }else if (userInput>=80 && userInput<=89){
            System.out.println("4");
        }else if (userInput>=90 && userInput<=100){
            System.out.println("5");
        }else{
            System.out.println("incredible!");
        }
    }
}
