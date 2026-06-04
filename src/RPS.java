import java.util.Scanner;
import java.util.Random;
public class RPS {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String choice ;
        boolean isPlaying = true;
        String playAgain;
        String[] RPS={"ROCK","PAPER","SCISSOR"};
        while(isPlaying){
            System.out.println("Enter the choice:");
            choice = scanner.nextLine().toUpperCase();
            int S = random.nextInt(RPS.length);
            String CC = RPS[S];
            if(choice.equals(CC)){
                System.out.println("DRAW");
            }
            else if((choice.equals("ROCK")&&CC.equals("PAPER"))
                    ||(choice.equals("PAPER")&&CC.equals("SCISSOR"))
                    ||(choice.equals("SCISSOR")&&CC.equals("ROCK"))) {
                System.out.println("Computer Wins");
            }
            else if((choice.equals("PAPER")&&CC.equals("ROCK"))
                    ||(choice.equals("SCISSOR")&&CC.equals("PAPER"))
                    ||(choice.equals("ROCK")&&CC.equals("SCISSOR"))) {
                System.out.println("YOU Win");
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println("ENTER YES IF YOU WANNA PLAY AGAIN ELSE NO");
            playAgain = scanner.nextLine().toUpperCase();
            if(playAgain.equals("NO")){
                isPlaying=false;
                System.out.println("Goodbye ");
            }
        }
        scanner.close();
    }
}
