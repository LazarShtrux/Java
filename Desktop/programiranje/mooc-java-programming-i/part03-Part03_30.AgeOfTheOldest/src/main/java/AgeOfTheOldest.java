
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (true) {
            String nameAndAge = scanner.nextLine();
            if (nameAndAge.equals("")) {
                break;
            }

            String[] array = nameAndAge.split(",");
            int age = Integer.valueOf(array[1]);
            if(age>i){
                i=age;
            }
        }
        System.out.println("Age if the oldest: " + i);
    }
}
