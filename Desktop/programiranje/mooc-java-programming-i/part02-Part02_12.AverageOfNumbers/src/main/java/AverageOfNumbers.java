
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNums = 0;
        int numOfNums = 0;
        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if(input!= 0){
                sumOfNums= input+ sumOfNums;
                numOfNums= numOfNums+1;
            } else{
                System.out.println("Average of the numbers: " + (double)sumOfNums/numOfNums);
                break;
            }
        }

    }
}
