import java.util.Scanner;
public class Rarea {
    public static void main(String[] args){
        double H ;
        double W ;
        double A ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width :");
        H = scanner.nextDouble();
        System.out.print("Enter the Height :");
        W = scanner.nextDouble();
        A= H*W;
        System.out.print("the area of rectangle is :" + A +"cm");
        scanner.close();
    }
}
