import java.util.Random;
import java.util.Scanner;
public class Guesstheno {
    public static void main(String[] args){
        int number;
        int attempts = 0;
        int yno = -1;
        Random random = new Random();
        number = random.nextInt(0,101);
//        System.out.println(number);
        Scanner scanner= new Scanner(System.in);
        while(yno != number && attempts < 5) {
            System.out.print("PLease Enter a number (1-100) :");
            yno = scanner.nextInt();
            attempts++;

            if(yno>number + 10){
                System.out.println("Too High,try again");
            }
            else if(yno<number - 10){
                System.out.println("Too Low!,try again");
            }
            else if (yno<number || yno>number) {
                System.out.println(" oh u almost got it right");
            }
        }
        if (yno == number) {
            System.out.println("CONGRATULATIONS you have guessed it right !");
        } else {
            System.out.println("BETTER LUCK NEXT TIME!");
            System.out.println("the number is " + number);
        }
        scanner.close();

    }
}
