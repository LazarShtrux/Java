import java.util.Scanner;
public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something!");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote: " + value);
    }
}
