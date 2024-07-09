
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfNums = 0;
        int sumOfNums = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0){
                break;
            } else if(input>0){
                sumOfNums += input;
                numOfNums++;
            }
        }
        if(numOfNums>0){
            System.out.println((double)sumOfNums/numOfNums);
        }else {
            System.out.println("Cannot calculate average");
        }
            
    }
}
