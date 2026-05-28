import java.util.Scanner;
public class OddorEven {
    public static void main(String[] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("prints whether each number from 1 to that number is: ");
        num = scanner.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i + " is Even");
            }
            else{
                System.out.println(i+" is Odd");
            }
        }
        scanner.close();
    }
}
