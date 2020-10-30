import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class wpmProgram {
    public static void main(String [] args) throws InterruptedException {
     String [] words = {"envelope", "Mosque", "the", "hello" , "microphone", "elephant","biscuit","hammer","went","love"};

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("Start writing");
        TimeUnit.SECONDS.sleep(Long.parseLong("2"));

    Random rand = new Random();
    for (int i = 0; i < 10; i++){
        System.out.print(words[rand.nextInt(9)]+ " ");
    }
    System.out.println();

    double start = LocalTime.now().toNanoOfDay();

    Scanner scan = new Scanner(System.in);
    String typedWords = scan.nextLine();

    double end = LocalTime.now().toNanoOfDay();
    double elapsedTime = end - start;
    double seconds = elapsedTime/ 1000000000.0;
    int numChars = typedWords.length();

    int wpm = (int) ((((double) numChars / 5) / seconds) * 60);

    System.out.println("Your WPM is "+wpm+ "!");

    // the formula for WPM : (x characters / 5) / 1 min = y WPM
    }
}




