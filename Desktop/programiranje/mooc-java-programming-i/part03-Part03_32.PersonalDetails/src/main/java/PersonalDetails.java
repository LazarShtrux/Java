
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j=0;
        int sum=0;
        int length=0;
        int count=0;
        String name="";
        while(true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            String[] array = input.split(",");
            
            int nameLength = Integer.valueOf(array[0].length());
            int birthYear = Integer.valueOf(array[1]);
            sum+=birthYear;
            count++;
            //Finding longest name
            if(nameLength > j){
                j=nameLength;
                name = array[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " +1.0* sum/count);

    }
}
