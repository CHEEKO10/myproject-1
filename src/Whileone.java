import java.util.Scanner;
public class Whileone {
    public static void main(String[] args){
        int num=-1;
        int sum = 0 ;
        Scanner scanner = new Scanner(System.in);
        while(num != 0){
            System.out.print("Enter a Number:");
            num = scanner.nextInt();
            sum+=num;
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
