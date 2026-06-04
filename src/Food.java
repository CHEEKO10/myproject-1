import java.util.Scanner;
public class Food {
    public static void main(String[] args){
        String[] food;
        int size ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number food do u want :");
        size = scanner.nextInt();
        scanner.nextLine();
        food = new String[size];
        for(int i=0;i<size;i++) {
            System.out.print("Enter the food at " + i +" : ");
            food[i] = scanner.nextLine();
        }
        for(int i=0;i<size;i++){
            System.out.println(food[i]);
        }
        scanner.close();
    }
}
