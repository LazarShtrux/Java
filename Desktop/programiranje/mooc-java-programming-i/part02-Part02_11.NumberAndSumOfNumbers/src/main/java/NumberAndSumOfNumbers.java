
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumOfNums = 0;
        int numberOfNums = 0;
        int input = 0;
        while(true){
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());
            if(input!=0){
                sumOfNums = sumOfNums+input;
                numberOfNums = numberOfNums+1;
                
            } else {
                System.out.println("Sum of the numbers: " + sumOfNums);
                System.out.println("Number of numbers: " + numberOfNums);
                break;
            }
        }

    }
}
