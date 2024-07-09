
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[]inputArray = input.split(" ");
            
            for(String word:inputArray){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }

        }


    }
}
