import java.util.Scanner;
public class MultiplicationT {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("MULTIPLICATION TABLE");
        System.out.print("Enter a number to obtain its multiplication table :");
        num = scanner.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
        scanner.close();
    }
}
