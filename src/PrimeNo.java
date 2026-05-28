import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args ){
        int num;
        int i= 2;
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to identify whether the number is prime or not :");
        num = scanner.nextInt();
        for(i=2;i<num;i++){
            if(num%i==0) {
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        scanner.close();
    }
}
