
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        while(true){
            System.out.println("Give a number:");
            int x = Integer.valueOf(scanner.nextLine());
            if(x<0){
                numOfNums = numOfNums+1;
                continue;
            } else if (x>0){
                continue;
            } else {
                break;
            } 
        }
        System.out.println("Number of negative numbers: " + numOfNums);
    }
}
