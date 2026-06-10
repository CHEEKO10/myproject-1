import java.util.Scanner;
public class IntStr {
    public static void main (String[] args){
        String num1;
        String num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        num1 = scanner.next();
        System.out.println("Enter the number 2: ");
        num2 = scanner.next();
        int no1=Integer.parseInt(num1);
        int no2=Integer.parseInt(num2);
        int n =Integer.compare(no1,no2);
        System.out.println(n);
        scanner.close();
    }
}
