
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array;
        while(true){
            String word = scanner.nextLine();
            if(word.equals("")){
                break;
            }
            array= word.split(" ");
            for (String input : array){
                System.out.println(input);
                
            }
        }
        

    }
}
