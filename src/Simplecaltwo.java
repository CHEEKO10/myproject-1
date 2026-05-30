import java.util.Scanner;
public class Simplecaltwo {
    public static void main(String[] arg){
        int key;
        int n,m;
        double result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) division");
        System.out.print("Enter the key:");
        key=scanner.nextInt();
        System.out.println("Enter the first number :");
        n = scanner.nextInt();
        System.out.println("Enter the second number :");
        m = scanner.nextInt();
        switch(key){
            case 1 ->{
            System.out.println(addno(n,m));
            }
            case 2 ->{
                System.out.println(subno(n,m));
            }
            case 4 ->{
                if(m==0){
                    System.out.println("Invalid");
                }
                else{
                    result = divno(n,m);
                    System.out.printf("%.2f",result);
                }
            }
            case 3 -> System.out.println(multi(n,m));
            default -> System.out.println("Enter a valid number ");
        }
        scanner.close();
    }
    static int addno(int n,int m){
        return n+m;
    }
    static int subno(int n,int m){
        return n-m;
    }
    static double divno(int n, int m){
        return (double)n / m;
    }
    static int multi(int n,int m){
        return n * m ;
    }
}
