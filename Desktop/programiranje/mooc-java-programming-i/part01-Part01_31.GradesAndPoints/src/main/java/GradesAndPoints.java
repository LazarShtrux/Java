
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
/*< 0	impossible!
0-49	failed
50-59	1
60-69	2
70-79	3
80-89	4
90-100	5
> 100	incredible!
*/
        System.out.println("Give points [0-100]:");
        int x = Integer.valueOf(scan.nextLine());
        if(x<0){
            System.out.println("impossible!");
        } else if(x<=49){
            System.out.println("failed");
        } else if(x<=59){
            System.out.println("1");
        } else if(x<=69){
            System.out.println("2");
        } else if(x<=79){
            System.out.println("3");
        } else if(x<=89){
            System.out.println("4");
        } else if(x<=100){
            System.out.println("5");
        } else{
            System.out.println("incredible!");
        }
    }
}