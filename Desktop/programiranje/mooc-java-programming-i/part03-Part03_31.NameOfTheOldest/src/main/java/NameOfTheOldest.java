
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        String name = "";
        while (true) {
            String nameAndAge = scanner.nextLine();
            if (nameAndAge.equals("")) {
                break;
            }

            String[] array = nameAndAge.split(",");
            
            int age = Integer.valueOf(array[1]);
            if (age > i) {
                i = age;
                name = String.valueOf(array[0]);
            }
        }
        System.out.println("Name of the oldest: " + (name));

    }
}
