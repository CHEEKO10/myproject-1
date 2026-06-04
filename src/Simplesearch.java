import java.util.Random;
import java.util.Scanner;
public class Simplesearch {
    public static void main(String[] arg){
        Random random = new Random();
        int target ;
        boolean isFound = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target (1 to 9): ");
        target = scanner.nextInt();
        int[] number =new int[10];
        for(int i=0;i<number.length;i++){
           number[i]= random.nextInt(1,10);
        }
        for (int i = 0; i<number.length;i++) {
            if (target == number[i]) {
                System.out.println("Target is found at index " + i);
                isFound = true;
            }
        }
        if(!isFound){
            System.out.println("Target not found");
        }
        for(int i= 0; i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        scanner.close();
    }
}
