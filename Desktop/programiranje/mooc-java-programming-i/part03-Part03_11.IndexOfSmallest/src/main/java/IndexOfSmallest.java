
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        while(true){
            int input = scanner.nextInt();
            if(input==9999)
                break;
            list.add(input);
        }
        int smallest = list.get(0);
        for(int i=0; i<list.size(); i++){
            int number= list.get(i);
            if(smallest>number){
                smallest=number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        int search=smallest;
        for(int index=0; index<list.size(); index++){
            if(search==list.get(index)){
                System.out.println("Found at index: " + index );
            }
        }
        
           
                
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
