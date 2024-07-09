

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);
    }
    public static void printFromNumberToOne(int number){
        int count = 0;
        while (number>count){
            System.out.println(number);
            number--;
        }
    }
}
