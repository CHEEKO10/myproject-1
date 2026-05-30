
import java.util.Scanner;
public class SimpleMatrics {
    public static void main(String[] args){
        int row , column;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number of rows:");
        row = scanner.nextInt();
        System.out.println("Enter the Number of Columns:");
        column = scanner.nextInt();
        int[][] matrics=new int[row][column];
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter the number at ["+i+"]["+j+"]" );
                matrics[i][j] = scanner.nextInt();
            }
        }
        System.out.println("printing the matrics:");

        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrics[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}