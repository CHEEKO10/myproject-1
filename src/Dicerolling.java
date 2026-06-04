import java.util.Random;
import java.util.Scanner;
public class Dicerolling {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int NumOfDice;
        int dice;
        int total = 0;
        System.out.print("Enter the number of dice to be rolled:");
        NumOfDice = scanner.nextInt();
        if (NumOfDice < 1) {
            System.out.println("Enter the valid number ");
        } else {
            for (int i = 0; i < NumOfDice; i++) {
                dice = random.nextInt(1, 7);
                System.out.println("you rolled " + dice);
                DiceOne(dice);
                total += dice;
            }
        }
        System.out.println(total);
    }

    static void DiceOne(int dice) {
        String dice1 = """
                -----------
                |         |
                |    ●    |
                |         |
                -----------
                """;
        String dice2 = """
                -----------
                |  ●      |
                |         |
                |     ●   |
                -----------
                """;
        String dice3 = """
                -----------
                | ●       |
                |    ●    |
                |       ● |
                -----------
                """;
        String dice4 = """
                -----------
                | ●     ● |
                |         |
                | ●     ● |
                -----------
                """;
        String dice5 = """
                -----------
                | ●     ● |
                |    ●    |
                | ●     ● |
                -----------
                """;
        String dice6 = """
                -----------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                -----------
                """;
        switch (dice) {
            case 1 -> {
                System.out.println(dice1);
            }
            case 2 -> {
                System.out.println(dice2);
            }
            case 3 -> {
                System.out.println(dice3);
            }
            case 4 -> {
                System.out.println(dice4);
            }
            case 5 -> {
                System.out.println(dice5);
            }
            case 6 -> {
                System.out.println(dice6);
            }
        }
    }
}
