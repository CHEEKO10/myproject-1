import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] arg) {

        String filepath = "src\\words.txt";
        ArrayList<String> words = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String Line ;
            while((Line = reader.readLine())!=null){
                words.add(Line.trim());
            }

        }
        catch(FileNotFoundException e ){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));


        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> W = new ArrayList<>();
        int wrongGuesses = 0 ;
        System.out.println("Welcome players");
        for(int i = 0;i<word.length();i++){
            W.add('_');
        }
        while(wrongGuesses<6){
            System.out.println(HangManArt(wrongGuesses));
            System.out.println("Word: ");
            for(char c : W){
                System.out.print(c);
            }
            System.out.println();
            System.out.print("Guess a letter: ");
            char Guess = scanner.next().toLowerCase().charAt(0);
            if(word.indexOf(Guess) >= 0){
                System.out.println("Correct Guess!");
                for(int i = 0;i<word.length();i++){
                    if(word.charAt(i)==Guess) {
                        W.set(i,Guess);
                    }
                }
            }
            else {
                wrongGuesses++;
                System.out.println("Wrong Guess!");
            }
            if(!W.contains('_')){
                System.out.println("Congratulations!!!");
                System.out.println("The word was "+ word);
                System.out.println(HangManArt(wrongGuesses));
                break;
            }
        }
        if(wrongGuesses==6){
            System.out.println("GAME OVER");
            System.out.println(HangManArt(wrongGuesses));
            System.out.println("The word is : "+ word);
        }
        scanner.close();
    }
    static String HangManArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 ->
                """



                        """;
            case 1 ->
                    """
                         o


                            """;
            case 2 ->
                    """
                         o
                         |

                            """;
            case 3 ->
                    """
                         o
                        /|

                            """;
            case 4 ->
                    """
                         o
                        /|\\

                            """;
            case 5 ->
                    """
                         o
                        /|\\
                        /
                            """;
            case 6 ->
                    """
                         o
                        /|\\
                        / \\
                            """;
            default -> "";


        };
    }
}