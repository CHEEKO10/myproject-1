import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PlayJB {
    public static void main(String[]args){
        String filepath="src\\sorry.wav";
        String filepath2 ="src\\yukon.wav";
        File file = new File(filepath);
        File file1= new File(filepath2);
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file1)){
            Clip clip =AudioSystem.getClip();
            Clip clip1 = AudioSystem.getClip();
            clip.open(audioStream);
            clip1.open(audioStream1);

            String response="";
            while(!response.equals("Q")){
                System.out.println("Press P to Play");
                System.out.println("Press Q to Quit");
                System.out.println("Press S to Stop");
                System.out.println("Press R to Restart");
                response=scanner.nextLine().toUpperCase();

               switch(response){
                   case "P"-> {
                       System.out.print("Enter 1 to play sorry\n");
                       System.out.print("Enter 2 to play yukon\n");
                       int opt = scanner.nextInt();
                       scanner.nextLine();
                       if(opt == 1){
                           clip.start();
                       } else if (opt == 2) {
                           clip1.start();
                       }
                       else{
                           System.out.println("Enter a valid option");
                       }
                   }
                   case "S"-> clip.stop();
                   case "R"-> clip.setMicrosecondPosition(0);
                   case "Q"-> clip.close();
                   default -> System.out.println("Enter a valid choice");
               }
            }
        }
        catch(LineUnavailableException e){
            System.out.println("Starting is null");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Unavailable resources");
        }
        catch(NullPointerException e){
            System.out.println("The file is empty");
        }
        catch(IOException e){
            System.out.println("File not found ");
        }
        finally {
            System.out.println("BYE");
        }
    }
}
