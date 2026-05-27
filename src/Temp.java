import java.util.Scanner;
public class Temp {
    public static void main(String[] args){
        double Temp;
        double Temp2;
        String key;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Temperature :");
        Temp = scanner.nextDouble();
        System.out.print("Enter the Unit (C or F):");
        key = scanner.next().toUpperCase();
        Temp2 = (key == "C") ? (5.0/9) * (Temp - 32) : (9.0/5) * Temp + 32;
        System.out.println(Temp2);
    }
}
