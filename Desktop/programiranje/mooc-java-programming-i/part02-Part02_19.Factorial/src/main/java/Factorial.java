
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        //factorial= 5!= 1*2*3*4*5
        int input = Integer.valueOf(scanner.nextLine());
        int sum=1;
        int count=1;
        while(count<=input){
            sum=sum*count;
            count++;
        }
        if(input==0){
            sum=1;
        }
        System.out.println("Factorial:" + sum);
    }
}
