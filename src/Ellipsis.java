import java.util.Scanner;
public class Ellipsis {
    public static void main(String[] arg){
        int key ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many number you are willing to add: ");
        key=scanner.nextInt();
        double[] arr= new double[key];
        for(int i=0;i<key;i++) {
            System.out.println("Enter the numbers");
            arr[i]= scanner.nextInt();
        }
        System.out.println(addsum(arr));
        scanner.close();
    }
    static double addsum(double... numbers){
        int sum=0;
        for(double number:numbers){
            sum+=number;
        }
        return sum/numbers.length;
    }
}
