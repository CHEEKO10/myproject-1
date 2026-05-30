import java.util.Scanner;
public class Bankingsimple {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key;
        double balance=0;
        double amount ;
        boolean isRunning = true;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Welcome to the banking program");
        while(isRunning) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Press 1 for Deposit");
            System.out.println("Press 2 for Withdrawal");
            System.out.println("Press 3 for view balance ");
            System.out.println("Press 4 for Exit");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.print("Enter the number :");
            key = scanner.nextInt();
                switch (key) {
                    case 1 -> {
                        balance =  balance + deposit();
                        System.out.println(balance);
                    }
                    case 2-> {
                        System.out.println("Enter the amount to be withdrawn :");
                        balance = balance-withdrawal();
                    }
                    case 3 ->{
                        System.out.println("Show balance");
                        showBalance(balance);
                    }
                    case 4 ->{
                        System.out.println("Exiting ");
                        isRunning=false;
                    }
                    default -> System.out.println("Enter a valid number ");
                }
        }
    }
    static double deposit() {
        double amount;
        System.out.println("Enter the deposit");
        amount = scanner.nextDouble();
        return amount;
    }
    static void showBalance(double balance){
        System.out.printf("$%f\n",balance);
    }
    static double withdrawal(){
        double amount ;
        System.out.println("Enter the amount to be withdrawn ");
        amount = scanner.nextDouble();
        return amount ;
    }
}
