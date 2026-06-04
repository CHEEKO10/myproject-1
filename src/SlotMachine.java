import java.util.Scanner;
import java.util.Random;
public class SlotMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int balance;
        int bet;
        char yn ;
        String slot1,slot2,slot3;
        boolean isPlaying = true;
        String[] Options = {"🍒", "🍋", "🔔", "⭐", "7"};
        System.out.println("Enter the Amount in your wallet");
        balance=scanner.nextInt();
        do{
            System.out.println("Enter the bet amount:");
            bet = scanner.nextInt();
            if (bet<=0 || bet>balance){
                System.out.println("Invalid Bet");
                isPlaying = false;
            }
            else {
                balance-=bet;
                System.out.println("The Slots are:");
                slot1 = Options[random.nextInt(Options.length)];
                slot2 = Options[random.nextInt(Options.length)];
                slot3 = Options[random.nextInt(Options.length)];
                System.out.println(slot1 + " " + slot2 + " " + slot3);
                if(slot1.equals(slot2)&&slot1.equals(slot3)){
                    balance = one(balance,bet);
                    System.out.println(balance);
                } else if((slot1.equals(slot2))||(slot1.equals(slot3))||(slot2.equals(slot3))){
                    balance=(two(balance,bet));
                    System.out.println(balance);
                }
                else{
                    System.out.println(balance);
                }
                System.out.println("Do you want to continue ?(y/n): ");
                yn = scanner.next().charAt(0);
                if(yn=='n'){
                    isPlaying = false;
                    System.out.println("Thank you for playing");
                }
            }
        }while(isPlaying);
        scanner.close();
    }
    static int one(int balance,int bet){
        balance+=bet*5;
        return balance;
    }
    static int two(int balance,int bet) {
        balance += bet * 2;
        return balance;
    }
}
