import java.util.Random;
import java.util.Scanner;
public class Guesstheno {
    public static void main(String[] args){
        int number;
        int yno;
        Random random = new Random();
        number = random.nextInt(0,7);
//        System.out.println(number);
        Scanner scanner= new Scanner(System.in);
        System.out.print("PLease Enter a number (1-6) :");
        yno = scanner.nextInt();
        if(yno==number){
            System.out.println("CONGRATULATIONS you have guessed it right !");
        }
        else{
            System.out.println("BETTER LUCK NEXT TIME");
        }
        scanner.close();

    }
}
