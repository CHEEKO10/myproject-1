import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to start the countdown");
        final int response = scanner.nextInt();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = response;
            @Override
            public void run() {
                if (count >= 0) {
                    System.out.println(count);
                    count--;
                } else {
                    System.out.println("Countdown completed");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,0,1000);
    }
}
