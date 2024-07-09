
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sumOfNums = 0;
        int numOfNums = 0;
        double average = 0;
        int even = 0;
        int odd = 0;
        while (true){
            int input= Integer.valueOf(scanner.nextLine());
            if (input == -1){
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sumOfNums);
                System.out.println("Numbers: " + numOfNums);
                System.out.println("Average: " + average);
                System.out.println("Even: " + even);
                System.out.println("Odd: " + odd);
                break;
            } else{
                sumOfNums = sumOfNums + input;
                numOfNums++;
                average = 1* (double)sumOfNums/numOfNums;
            }
            if (input%2==0){
                even++;
            } else{
                odd++;
                continue;
            }
        }
    }
}
