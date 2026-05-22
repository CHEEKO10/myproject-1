import java.util.Scanner;
public class shopping {
    public static void main(String[] args){
        String item ;
        int Quantity ;
        char currency = '$';
        double cash ;
        double total;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Item :");
        item = scanner.nextLine();
        System.out.print("How much would you like :");
        Quantity = scanner.nextInt();
        System.out.print("for one "+item+" it would be ");
        cash = scanner.nextDouble();
        total = cash * Quantity;
        System.out.print(" please pay "+currency+total);
        System.out.println("\n Thank you for visiting");
    }
}
