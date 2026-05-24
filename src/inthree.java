import java.util.Scanner;
public class inthree {
    public static void main(String[] args){
        int a , b , c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a:");
        a = scanner.nextInt();
        System.out.println("Enter the number b:");
        b = scanner.nextInt();
        System.out.println("Enter the number c:");
        c = scanner.nextInt();
        if(a>b){
            if(a>c){
                System.out.print(a + " is the greatest of all three ");
            }
            else{
                System.out.print(c +" is the greatest of all three ");
            }

        }
        else if(c>b){
            System.out.print(c +" is the greatest of all three ");
        }
        else{
            System.out.print( b+ " is the greatest of all three ");
        }
        scanner.close();
    }
}
