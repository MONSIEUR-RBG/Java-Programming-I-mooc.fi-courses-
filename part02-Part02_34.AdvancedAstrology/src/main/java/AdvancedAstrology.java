
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for(int i=1; i<=number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i=1; i<=number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i=1; i<=size ; i++){
            printSpaces(size-i);
            
            printStars(i);
        }
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        //print the tree leaves(the triangle)
        for(int i =1; i<=height; i++){
            //Space decrease as we go down
            printSpaces(height-i);
            //Stars increase by 2 fo each row
            printStars(2*i-1);
//            System.out.println();
        }
        //Printing the base row (2rows height , 3stars wide)
        for (int i = 0; i < 2; i++) {
            //To center 3 stars, the base needs (height-2) spaces
            printSpaces(height-2);
            printStars(3);
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
