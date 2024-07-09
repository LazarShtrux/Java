
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        int lastNumber = Integer.valueOf(scanner.nextLine());
        for(int start=0; start<lastNumber; start++){
            int x = start+lastNumber;
             System.out.println(x);
        }
    }
}
