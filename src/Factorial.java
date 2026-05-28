import java.util.Scanner;
public class Factorial {
    public static void main(String[] arg){
        int num;
        int i;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        num = scanner.nextInt();
        if(num==0){
            System.out.println(num+1);
        }
        else {
            for (i = num - 1; i > 1; i--) {
                num *= i;
            }
            System.out.println(num);
            scanner.close();
        }
    }
}
