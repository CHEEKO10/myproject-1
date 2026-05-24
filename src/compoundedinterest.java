
import java.util.Scanner;
public class compoundedinterest {
    public static void main(String[] args){
        double rate;
        int years;
        double amount;
        int times_compounded;
        int principal;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the amount you want to deposited in your bank account :");
        principal = scanner.nextInt();
        System.out.print("Enter the rate of interest provided by the bank :");
        rate = scanner.nextDouble()/100;
        System.out.print("Enter the number of years :");
        years = scanner.nextInt();
        System.out.print("the number of times compounded :");
        times_compounded = scanner.nextInt();
        amount = principal*Math.pow(1+rate/times_compounded,times_compounded*years);
        System.out.println("The amount will be " + amount + " in " + years +" years");
        scanner.close();
    }
}
