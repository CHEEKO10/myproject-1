import java.util.Scanner;

public class Ifelsevote {
    public static void main (String[] args){
       String name;
       int age;
        System.out.println("WELCOME TO THE VOTING SYSTEM!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your name :");
        name = scanner.nextLine();
        System.out.println("Hello "+name+" !");
        System.out.print("Enter your age :");
        age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are eligible for voting ");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
        System.out.println("THANK YOU FOR VISITING!");

        scanner.close();
    }
}
