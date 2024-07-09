
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number?");
        int startNum= Integer.valueOf(scanner.nextLine());
        System.out.println("End number?");
        int numOfNums= Integer.valueOf(scanner.nextLine());
        int sum=0;
        while(startNum<=numOfNums){
            sum=sum+startNum;
            startNum++;
        }
        System.out.println("The sum is: " + sum);
        
    }
}
