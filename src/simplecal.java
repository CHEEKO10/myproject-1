import java.util.Scanner;
public class simplecal {
    public static void main(String[] arg){
        int num;
        int num1;
        double result = 0;
        int key;
        boolean isNUM=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 for Addition ");
        System.out.println("Enter 2 for Subtraction ");
        System.out.println("Enter 3 for Division ");
        System.out.println("Enter 4 for Multiplication ");
        key = scanner.nextInt();
        System.out.print("Enter the first number: ");
        num = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num1 = scanner.nextInt();
        switch(key){
            case 1 -> result = num + num1;
            case 2 -> result = num - num1;
            case 3 -> {
                if (num1==0){
                    System.out.println("You cannot divide by zero");
                    isNUM =false;
                }
                else {
                    result = (double)num / num1;
                }
            }
            case 4 -> result = num * num1;
            default -> {
                System.out.println("Enter the valid number");
                isNUM =false;
            }

        }
        if(isNUM) {
            System.out.println(result);
        }
        scanner.close();
    }
}
