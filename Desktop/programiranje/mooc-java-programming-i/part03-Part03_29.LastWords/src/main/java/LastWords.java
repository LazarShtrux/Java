
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            String[] array = input.split(" ");
            int i = array.length-1;
            System.out.println(array[i]);
            
        }


    }
}
