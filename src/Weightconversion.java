import java.util.Scanner;
public class Weightconversion {
    public static void main(String[] args){
        double kg ;
        double pound ;
        int key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to weight conversion program");
        System.out.println("If you want to convert the weight from kg to pound ENTER 1 or if you want to convert the weight from pound to kd ENTER 2 ");
        key =  scanner.nextInt();
        if (key==1){
            System.out.println("Please Enter your weight in kg :");
            kg = scanner.nextDouble();
            pound = kg * 2.20462;
            System.out.println("pound = " + pound);
        }
        else if(key==2){
            System.out.println("Please Enter your weight in Pound :");
            pound = scanner.nextDouble();
            kg = pound/2.20462;
            System.out.println("kg = "+kg);
        }
        else{
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}
